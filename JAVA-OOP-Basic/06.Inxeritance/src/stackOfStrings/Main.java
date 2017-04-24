package stackOfStrings;

public class Main {

    public static void main(String[] args) {

        StackOfStrings sos = new StackOfStrings();
        sos.push("pesho");
        sos.push("nedialko");
        sos.push("evlogi");

        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
    }
}
