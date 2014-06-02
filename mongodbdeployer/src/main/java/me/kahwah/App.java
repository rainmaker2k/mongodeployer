package me.kahwah;

import me.kahwah.deployer.Deployer;
import me.kahwah.models.Component;
import org.mongodb.morphia.query.Query;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.nio.file.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static java.nio.file.StandardWatchEventKinds.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Deployer deployer = (Deployer)context.getBean("deployer");

        Component component = new Component();
        component.setItemId(22);
        component.setPublicationId(1);

        Map<String, Object> fields = new HashMap<String, Object>();
        fields.put("name", "Hello Worlds");
        fields.put("publishedDate", new Date());

        component.setFields(fields);

        deployer.getComponentDao().save(component);

        Query<Component> query = deployer.getComponentDao().getDs().createQuery(Component.class);
        query.field("itemId").equals(22);
        query.field("publicationId").equals(1);

        Component retrieved = query.get();

        System.out.println("retrieved component: " + retrieved.getFields().get("name"));
        System.out.println("retrieved component published Date: " + retrieved.getFields().get("publishedDate"));
        System.out.println("Config: " + deployer.getConfig().getString("database"));

        System.out.println( "Hello World!" );

        try {
            WatchService watcher = FileSystems.getDefault().newWatchService();

            WatchKey key;

            Path dir = FileSystems.getDefault().getPath("incoming");
            DirectoryStream<Path> files = Files.newDirectoryStream(dir);
            for (Path existingFile : files) {
                System.out.println(existingFile.toString());
            }
            dir.register(watcher, ENTRY_CREATE);

            for (;;) {

                key = watcher.take();

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();

                    if (kind == OVERFLOW) {
                        continue;
                    }

                    WatchEvent<Path> ev = (WatchEvent<Path>)event;
                    Path filename = ev.context();

                    Path child = dir.resolve(filename);
                    String mimetype = Files.probeContentType(child);
                    if (!"text/plain".equals(mimetype)) {
                        System.err.format("New file '%s'" +
                                " is not a plain text file.%n", filename);
                        continue;
                    }

                    System.out.println("File placed: " + filename);
                }

                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
