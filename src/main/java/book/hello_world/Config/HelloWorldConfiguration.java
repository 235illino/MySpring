package book.hello_world.Config;


import book.hello_world.Provider.HelloWorldMessageProvider;
import book.hello_world.Provider.MessageProvider;
import book.hello_world.Renderer.MessageRenderer;
import book.hello_world.Renderer.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
