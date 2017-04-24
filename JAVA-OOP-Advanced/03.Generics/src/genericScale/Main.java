package genericScale;

public class Main {
    public static void main(String[] args) {

        Scale<Integer>integ = new Scale<>(5,4);
        System.out.println(integ.getHeavier());
    }
}
