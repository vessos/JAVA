import java.util.Scanner;

public class tringleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        double triangleArea = area(base,height);

        System.out.printf("Area = %.2f",triangleArea);


    }
    static double area(double a,double h){
        return (a*h)/2;
    }
}
