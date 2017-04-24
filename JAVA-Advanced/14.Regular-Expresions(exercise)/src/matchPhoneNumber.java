import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchPhoneNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^\\+359( |-)2\\1(\\d{3})\\1(\\d{4})$");

        String line = reader.readLine();

        while(!line.equals("end")){

            Matcher matcher = pattern.matcher(line);

            if(matcher.find()){
                System.out.println(matcher.group());
            }
            line=reader.readLine();
        }
    }
}
