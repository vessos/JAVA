package library;

import logger.Appender;
import logger.Layout;

public class FileAppender implements Appender {

    private Layout layout;

    public FileAppender(Layout layout) {
        this.layout = layout;
    }
}
