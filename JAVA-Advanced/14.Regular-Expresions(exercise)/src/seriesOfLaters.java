import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class seriesOfLaters {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("([A-Za-z !?,])\\1*");
        String line = reader.readLine();

        Matcher matcher = pattern.matcher(line);
        while(matcher.find()){

            System.out.print(matcher.group(1));
        }

        //System.out.println(line);



    }
}
