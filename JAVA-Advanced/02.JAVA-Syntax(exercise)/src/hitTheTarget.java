import java.util.Scanner;

public class hitTheTarget {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=20 ; i++) {
            for (int j = 1; j <=20 ; j++) {
                int sum =i+j;
                if (sum==target){
                    System.out.printf("%d + %d = %d",i,j,target);
                    System.out.println();
                }

            }
        }

        for (int i = 1; i <=20; i++) {
            for (int j = 1; j <=20 ; j++) {
                int sum = i-j;
                if (sum==target){
                    System.out.printf("%d - %d = %d",i,j,target);
                    System.out.println();
                }
            }
        }

    }
}
