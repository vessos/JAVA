import java.util.Scanner;

public class rectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[]input = scanner.nextLine().split(" ");

        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);

        double sum = a*b;

        System.out.printf("%.2f",sum);
    }
}
