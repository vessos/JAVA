package p01_system_resources;

public class Main {
    public static void main(String[] args) {

        GreetingClock clock = new GreetingClock(new LocalTimeProvaider(),new ConsoleWriter());
        clock.greeting();
    }
}
