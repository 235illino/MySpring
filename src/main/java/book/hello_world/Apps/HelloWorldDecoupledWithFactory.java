package book.hello_world.Apps;

import book.hello_world.Provider.MessageProvider;
import book.hello_world.Renderer.MessageRenderer;
import book.hello_world.Config.MessageSupportFactory;

public class HelloWorldDecoupledWithFactory {


    public static void main(String[] args) {
        MessageProvider messageProvider = MessageSupportFactory.getinstance().getMessageProvider();
        MessageRenderer messageRenderer = MessageSupportFactory.getinstance().getMessageRenderer();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
