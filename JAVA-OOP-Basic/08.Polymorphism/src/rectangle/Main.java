package rectangle;

public class Main {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle(5.0,3.0);
        Square square = new Square(4.0);
        System.out.println(square.calculateArea());

        Rectangle rectangle = new Square(8.0);
        System.out.println(rectangle.calculateArea());
    }
}
