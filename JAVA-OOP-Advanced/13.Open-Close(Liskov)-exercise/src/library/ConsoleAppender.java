package library;

import logger.Appender;
import logger.Layout;

public class ConsoleAppender implements Appender {

    private Layout layout;

    public ConsoleAppender(Layout layout) {
        this.layout = layout;
    }
}
