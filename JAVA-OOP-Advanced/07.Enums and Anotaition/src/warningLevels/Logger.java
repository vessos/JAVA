package warningLevels;


import java.util.ArrayList;
import java.util.List;

public class Logger {
    private Importance treshhold;
    private List<Message> messages;

    public Logger(Importance treshhold) {
        this.treshhold = treshhold;
        this.messages = new ArrayList<>();
    }

    public void record(Message message) {
        if (message.getLevel().compareTo(this.treshhold) >= 0) {
            this.messages.add(message);
        }
    }

    public Iterable<Message> getMessages() {
        return messages;
    }

}
