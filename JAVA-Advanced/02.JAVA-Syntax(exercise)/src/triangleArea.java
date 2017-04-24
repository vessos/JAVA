import java.util.Scanner;

public class triangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        String[] input3 =scanner.nextLine().split(" ");

        int point1X = Integer.parseInt(input1[0]);
        int point1Y = Integer.parseInt(input1[1]);
        int point2X = Integer.parseInt(input2[0]);
        int point2Y = Integer.parseInt(input2[1]);
        int point3X = Integer.parseInt(input3[0]);
        int point3Y = Integer.parseInt(input3[1]);

        int area =Math.abs((point1X*(point2Y-point3Y)+
                point2X*(point3Y-point1Y)+
                point3X*(point1Y-point2Y))/2);

        System.out.println(area);
    }
}
