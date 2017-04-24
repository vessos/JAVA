import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class uniqueUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>();
        for (int i = 0; i < N; i++) {
            String name = scanner.nextLine();
            uniqueNames.add(name);
        }
        for (String name : uniqueNames) {
            System.out.println(name);
        }

    }
}
