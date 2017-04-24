import java.util.Scanner;

public class calculateExpresions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.next());
        double b =Double.parseDouble(scanner.next());
        double c =Double.parseDouble(scanner.next());

        double poww = (a+b+c)/Math.sqrt(c);

        double result1 = Math.pow((Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)-Math.pow(b,2)),poww);

       double result2 = Math.pow((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3)),(a-b));

        double diff = Math.abs((a+b+c)/3-(result1+result2)/2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",result1,result2,diff);
    }
}
