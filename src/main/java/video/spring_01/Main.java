package video.spring_01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import video.spring_01.config.DaoConfig;
import video.spring_01.config.ServiceConfig;
import video.spring_01.domain.Person;
import video.spring_01.service.PersonService;
@ComponentScan(basePackageClasses = {DaoConfig.class, ServiceConfig.class})
@Configuration
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/app-context.xml");
        Person vadik = context.getBean(PersonService.class).getByName("Vadiuwka");

        System.out.println("name: " + vadik.getName() + " age: " + vadik.getAge());
    }
}
