import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sumOfAllValues {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern start = Pattern.compile("^([A-Za-z_]+)(?=\\d)");
        Pattern end = Pattern.compile("(?<=[\\d])([A-Za-z_]+)$");

        String line = reader.readLine();

        ArrayList<String> keys = new ArrayList<>();
        Matcher matcher = start.matcher(line);

        if (matcher.find()) {
            keys.add(matcher.group());
        }
        Matcher matcher1 = end.matcher(line);
        if (matcher1.find()) {
            keys.add(matcher1.group());
        }
        if (keys.size() < 2) {
            System.out.println("<p>A key is missing</p>");
        } else {
            String text = reader.readLine();
           // String regex = String.format("(%s)([\\d\\.]+)(%s)", keys.get(0), keys.get(1));
            Pattern main = Pattern.compile(Pattern.quote(keys.get(0))+"([\\d\\.]+)"+Pattern.quote(keys.get(1)));
            Matcher matcher2 = main.matcher(text);
            double sum = 0;


            while (matcher2.find()) {
                sum += Double.parseDouble(matcher2.group(1));
            }


            if (sum != 0) {
                System.out.printf("<p>The total value is: <em>%.2f</em></p>", sum);
            } else {

                System.out.println("<p>The total value is: <em>nothing</em></p>");
            }

//([^\/\\\(\) ])([A-Za-z][\w\d_]+)(?=[\/\\\(\) ])
        }


    }
}
