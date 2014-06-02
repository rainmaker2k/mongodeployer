package me.kahwah;

import me.kahwah.deployer.Deployer;
import me.kahwah.models.Component;
import org.mongodb.morphia.query.Query;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
    }
}
