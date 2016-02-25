package university.epam.beans;


import university.epam.beans.EventLogger;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(String msg){
        System.out.println(msg);
    }
}
