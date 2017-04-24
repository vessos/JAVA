import java.util.Scanner;

public class fromBase7ToDecimal {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int result = 0;

        String[] chars = console.nextLine().split("");

        int[] reverse = new int[chars.length];

        for (int i = chars.length - 1; i >= 0; i--) {

            reverse[chars.length-1-i] = Integer.parseInt(String.valueOf(chars[i]));
        }

        for (int i = 0; i < reverse.length; i++) {

            int sum = (int) (reverse[i] * Math.pow(7, i));

            result += sum;
        }
        System.out.println(result);
    }
}
