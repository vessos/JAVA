import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class replaceATag {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder input = new StringBuilder();

        String line ="";
        while(!"END".equals(line=reader.readLine())){
            input.append(line).append("\r\n");
        }

        Pattern pat = Pattern.compile("<a\\s+(href=)");
    }
}
