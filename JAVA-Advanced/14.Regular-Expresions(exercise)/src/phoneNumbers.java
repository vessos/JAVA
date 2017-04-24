import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        Pattern pattern = Pattern.compile("(?<=\\W|^)([A-Z][a-z]*)[\\W_]*?(\\+?[\\d][\\(\\)\\/\\-\\. 0-9]*[0-9]+)",Pattern.MULTILINE);
        LinkedHashMap<String,String>phone = new LinkedHashMap<>();


        while(!"END".equals(line)){
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                phone.put(matcher.group(1),matcher.group(2).replaceAll("[\\)\\(\\/\\.\\- ]",""));
            }

            line = reader.readLine();
        }
        if(phone.size()>0){
            System.out.print("<ol>");
            for (String s : phone.keySet()) {
                System.out.printf("<li><b>%s:</b> %s</li>",s,phone.get(s));
            }
            System.out.print("</ol>");
        }else{
            System.out.print("<p>No matches!</p>");
        }



    }
}

