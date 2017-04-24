package library;

import logger.Layout;

public class SimpleLayout implements Layout {

    private String dateTime;
    private String reportLevel;
    private String message;

    public SimpleLayout(String dateTime, String reportLevel, String message) {
        this.dateTime = dateTime;
        this.reportLevel = reportLevel;
        this.message = message;
    }
}
