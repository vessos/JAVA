import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class textFilter {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]ban = reader.readLine().split(", ");
        String text = reader.readLine();

        for (String s : ban) {

            String replaced ="";
            for (int i = 0; i <s.length() ; i++) {
                replaced=replaced.concat("*");
            }

           text=text.replace(s,replaced);
        }

        System.out.println(text);
    }
}
