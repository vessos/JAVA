import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.Function;

public class consumerPrint {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = reader.readLine().split(" ");

        Consumer<String> print = (n)-> System.out.println(n);

        for (String name : names) {
            print.accept(name);
        }

    }
}
