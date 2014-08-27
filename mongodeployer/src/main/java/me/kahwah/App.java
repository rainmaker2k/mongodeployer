package me.kahwah;

import me.kahwah.deployer.DeployerService;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    private static org.slf4j.Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DeployerService deployer = (DeployerService)context.getBean("deployerService");

        deployer.startService();

    }
}
