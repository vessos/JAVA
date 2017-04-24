import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by MARK-Max on 03/02/2017.
 */
public class extractEmails {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("(?<=^| )[A-Za-z]+([-\\.])?[\\w]+@[\\w]+(-)?[\\w]+\\.[\\w]+\\.?[\\w]+");

        String line = reader.readLine();

        while(!"end".equals(line)){
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
            line = reader.readLine();
        }
    }

}
