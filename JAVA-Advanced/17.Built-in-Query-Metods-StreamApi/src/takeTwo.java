import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class takeTwo {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = reader.readLine().split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <tokens.length ; i++) {

            numbers.add(Integer.parseInt(tokens[i]));
        }

        numbers.stream()
                .distinct()
                .filter(x->10<=x && x<=20)
                .limit(2)
                .forEach(x-> System.out.print(x + " "));
    }
}
