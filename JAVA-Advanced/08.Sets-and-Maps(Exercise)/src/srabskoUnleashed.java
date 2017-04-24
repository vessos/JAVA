import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class srabskoUnleashed {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String,LinkedHashMap<String,Long>>places = new LinkedHashMap<>();

        String line = "";

        while(!"End".equals(line = reader.readLine())){

            Pattern pattern = Pattern.compile("^([A-Za-z]+ ?[A-Za-z]+ ?[A-Za-z]+) @([A-Za-z]+ ?[A-Za-z]+ ?[A-Za-z]+) ([0-9]+) ([0-9]+)$");
            Matcher matcher = pattern.matcher(line);

            if(matcher.find()){

                String city = matcher.group(2);
                String singer = matcher.group(1);
                long priceTicket = Long.valueOf(matcher.group(3));
                long ticketCount = Long.valueOf(matcher.group(4));
                long price = priceTicket*ticketCount;

                if(!places.containsKey(city)){

                    places.put(city,new LinkedHashMap<>());
                }
                if(!places.get(city).containsKey(singer)){
                    places.get(city).put(singer,0L);
                }
                long value = places.get(city).get(singer)+price;
                places.get(city).put(singer,value);
            }
        }

        for (String s : places.keySet()) {

            System.out.println(s);
            places.get(s).entrySet().stream()
                    .sorted((s1,s2)->Long.compare(s2.getValue(),s1.getValue()))
                    .forEach(x-> System.out.println("#  " + x.getKey() + " -> " + x.getValue()));
        }
    }
}
