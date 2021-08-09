package book.hello_world.Config;

import book.hello_world.Provider.MessageProvider;
import book.hello_world.Renderer.MessageRenderer;

import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;
    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;


    private MessageSupportFactory() {
        props = new Properties();
        try {
            props.load(this.getClass().getResourceAsStream(
                    "/config.properties"));
            String rendererClass =
                    props.getProperty(
                            "renderer.class");
            String providerClass =
                    props.getProperty(
                            "provider.class");
            renderer = (MessageRenderer)
                    Class.forName(rendererClass).newInstance();
            provider = (MessageProvider)
                    Class.forName(providerClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getinstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
