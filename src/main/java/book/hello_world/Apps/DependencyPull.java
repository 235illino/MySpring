package book.hello_world.Apps;

import book.hello_world.Renderer.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyPull {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring/app-context.xml");
        MessageRenderer msr = app.getBean(MessageRenderer.class);
        msr.render();
    }
}
