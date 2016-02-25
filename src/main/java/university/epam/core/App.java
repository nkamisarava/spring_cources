package university.epam.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import university.epam.beans.Client;
import university.epam.beans.ConsoleEventLogger;

public class App {

    Client client;
    ConsoleEventLogger eventLogger;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 2");

    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(
                client.getId(), client.getFullName()
        );
        eventLogger.logEvent(message);
    }

    App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }
}
