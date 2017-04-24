import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class readSortPrintarray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[num];

        for (int i = 0; i < num ; i++) {
            arr[i]=scanner.nextLine();
        }

        Arrays.sort(arr);

        for(String name:arr){
            System.out.println(name);
        }

    }
}
