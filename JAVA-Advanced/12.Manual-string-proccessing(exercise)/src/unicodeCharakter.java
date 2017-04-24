import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class unicodeCharakter {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        StringBuilder builder = new StringBuilder(reader.readLine());

        for (int i = 0; i < builder.length(); i++) {

            System.out.print(String.format("\\u%04x", builder.codePointAt(i)));
        }


    }


}
