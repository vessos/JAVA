import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class knightsOfHonor {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]knights = reader.readLine().split(" ");

        Consumer<String>print = n-> System.out.println("Sir " + n);

        for (String knight : knights) {
            print.accept(knight);
        }
    }
}
