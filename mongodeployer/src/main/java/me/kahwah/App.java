package me.kahwah;

import me.kahwah.deployer.Deployer;
import me.kahwah.deployer.Processor;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

/**
 * Hello world!
 *
 */
public class App {

    private static org.slf4j.Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Deployer deployer = (Deployer)context.getBean("deployer");

//        Component component = new Component();
//        component.setItemId(22);
//        component.setPublicationId(1);
//
//        Map<String, Object> fields = new HashMap<String, Object>();
//        fields.put("name", "Hello Worlds");
//        fields.put("publishedDate", new Date());
//
//        component.setFields(fields);
//
//        deployer.getComponentDao().save(component);
//
//        Query<Component> query = deployer.getComponentDao().getDs().createQuery(Component.class);
//        query.field("itemId").equals(22);
//        query.field("publicationId").equals(1);
//
//        Component retrieved = query.get();
//
//        System.out.println("retrieved component: " + retrieved.getFields().get("name"));
//        System.out.println("retrieved component published Date: " + retrieved.getFields().get("publishedDate"));
//        System.out.println("Config: " + deployer.getConfig().getString("database"));



    }
}
