package library;

import logger.Appender;
import logger.Logger;

public class MessageLogger implements Logger {

    private Appender appender;

    public MessageLogger(Appender appender) {
        this.appender = appender;
    }

    public String logError(String data,String message){
        if(message.startsWith("Error")){
            return String.format("%s - ERROR - %s",data,message);
        }else{
            return String.format("%s - INFO - %s",data,message);
        }

    }
}
