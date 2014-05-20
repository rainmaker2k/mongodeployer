package me.kahwah;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Deployer deployer = (Deployer)context.getBean("deployer");
        System.out.println( "Hello World!" );
    }
}
