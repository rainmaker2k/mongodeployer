package me.kahwah;

import me.kahwah.deployer.Deployer;
import me.kahwah.models.Component;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        component.setFields(fields);

        deployer.getComponentDao().save(component);

        System.out.println("Config: " + deployer.getConfig().getString("database"));

        System.out.println( "Hello World!" );
    }
}
