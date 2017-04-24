import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class setsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]input = scanner.nextLine().split(" ");

        int n = Integer.valueOf(input[0]);
        int m = Integer.valueOf(input[1]);

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        for (int i = 0; i <n+m ; i++) {
            if(i<n){
                set1.add(scanner.nextLine());
            }else{
                set2.add(scanner.nextLine());
            }

        }

        for (String s : set1) {
            if(set2.contains(s)){
                System.out.print(s+" ");
            }
        }
    }
}
