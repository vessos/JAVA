import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractTags {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("<.+?>");
        String m = reader.readLine();

        while(!m.equals("END")){
            Matcher matcher = pattern.matcher(m);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
            m=reader.readLine();
        }
    }
}
