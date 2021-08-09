package video.spring_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import video.spring_01.domain.Person;
import video.spring_01.service.PersonService;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/app-context.xml");
        Person vadik = context.getBean(PersonService.class).getByName("Vadiuwka");

        System.out.println("name: " + vadik.getName() + " age: " + vadik.getAge());
    }
}
