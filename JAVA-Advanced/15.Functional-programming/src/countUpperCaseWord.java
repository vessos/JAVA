import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.function.Function;

public class countUpperCaseWord {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]words= reader.readLine().split(" ");
        ArrayDeque<String>result = new ArrayDeque<>();

        Function<String,Boolean>isUppWord = n ->n.charAt(0)==n.toUpperCase().charAt(0);

        int count =0;

        for (String word : words) {
            if(isUppWord.apply(word)){
                count++;
                result.offer(word);
            }
        }
        System.out.println(count);
        int n = result.size();
        for (int i = 0; i <n ; i++) {
            System.out.println(result.poll());
        }
    }
}

