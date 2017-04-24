package p01_system_resources;

public class GreetingClock {

    private TimeProvider timeProvider;
    private Writer writer;

    public GreetingClock(TimeProvider timeProvider,Writer write) {
        this.timeProvider = timeProvider;
        this.writer = write;
    }

    public void greeting() {
        if (this.timeProvider.getHour() < 12) {
            this.writer.write("Good morning...");
        } else if (this.timeProvider.getHour() < 18) {
            this.writer.write("Good afternoon...");
        } else {
            this.writer.write("Good evening...");
        }
    }
}
