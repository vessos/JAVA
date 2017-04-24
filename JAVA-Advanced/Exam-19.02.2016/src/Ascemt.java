import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ascemt {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("([,_])([A-Za-z]+)([0-9])");

        List<String> patt = new ArrayList<>();

        String line = "";
        while(!"Ascend".equals(line = reader.readLine())){

            Matcher matcher = pattern.matcher(line);

            while(matcher.find()){

                StringBuilder builder = new StringBuilder();
                String group = matcher.group();
                String nword = matcher.group(2);
                int val = Integer.valueOf(matcher.group(3));

                if(",".equals(matcher.group(1))){
                    for (int i = 0; i <nword.length() ; i++) {
                        builder.append((char)(nword.charAt(i)+val));
                    }
                }else{

                    for (int i = 0; i <nword.length() ; i++) {
                        builder.append((char)(nword.charAt(i)-val));
                    }
                }
                patt.add(group);
                line = line.replaceAll(group,builder.toString());

                matcher = pattern.matcher(line);

            }
            System.out.println(line);
        }




    }
}
