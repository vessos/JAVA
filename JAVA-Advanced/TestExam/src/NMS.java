import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NMS {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = "";

        String line = "";
        while (!"---NMS SEND---".equals(line = reader.readLine())) {
            str += line;
        }

        String delimeter = reader.readLine();
        if("(space)".equals(delimeter)){
            delimeter = " ";
        }

        StringBuilder builder = new StringBuilder();


        for (int i = 0; i < str.length() - 1; i++) {
            if (str.toLowerCase().charAt(i) <= str.toLowerCase().charAt(i + 1)) {
                builder.append(str.charAt(i));
            } else {
                builder.append(str.charAt(i));
                builder.append(delimeter);
            }
        }
        builder.append(str.charAt(str.length()-1));


        System.out.println(builder.toString());
    }
}
