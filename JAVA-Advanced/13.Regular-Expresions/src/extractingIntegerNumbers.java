import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractingIntegerNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(reader.readLine());

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
