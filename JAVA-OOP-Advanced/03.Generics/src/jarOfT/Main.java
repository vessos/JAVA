package jarOfT;

public class Main {
    public static void main(String[] args) {

        Jar<String>jar = new Jar<>();
        jar.add("Petko");
        jar.add("Evlogi");
        jar.add("lelq penka");
        System.out.println(jar.remove());
        System.out.println(jar.remove());
        System.out.println(jar.remove());
    }
}
