import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countSubstringOccurences {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine().toLowerCase();
        String word = reader.readLine().toLowerCase();
        int count = 0;

        int input = text.indexOf(word);

        while (input != -1) {
            count++;
            input = text.indexOf(word, input + 1);
        }

        System.out.println(count);

    }
}
