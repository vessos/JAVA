import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sentenceExtractor {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String keyWord = reader.readLine();
        String text = reader.readLine();
        String pat = String.format("(?<=[\\.\\?!] |^)[A-Z]([a-z\\s,-]+)( %s )([a-z\\s,-]+[\\.\\!\\?])",keyWord);
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){

            System.out.println(matcher.group());
        }
    }
}

