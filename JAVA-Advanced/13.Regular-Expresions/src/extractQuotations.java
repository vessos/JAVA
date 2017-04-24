import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractQuotations {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern patern = Pattern.compile("('|\")(.+?)\\1");

        String line = reader.readLine();

        Matcher matcher = patern.matcher(line);
        while(matcher.find()){
            System.out.println(matcher.group(2));
        }
    }
}
