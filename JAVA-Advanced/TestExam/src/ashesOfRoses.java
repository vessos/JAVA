import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ashesOfRoses {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,HashMap<String,Long>>region = new HashMap<>();

        String input ="";

        while(!"Icarus, Ignite!".equals(input = reader.readLine())){

            Pattern pattern = Pattern.compile("^Grow <([A-z][a-z]+)> <([A-Za-z0-9]+)> ([0-9]+)$");

            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                if(!region.containsKey(matcher.group(1))){
                    region.put(matcher.group(1),new HashMap<>());
                }
                if(!region.get(matcher.group(1)).containsKey(matcher.group(2))){
                    region.get(matcher.group(1)).put(matcher.group(2),Long.valueOf(matcher.group(3)));
                }else{
                    long  rosesValue = region.get(matcher.group(1)).get(matcher.group(2))+Long.valueOf(matcher.group(3));
                    region.get(matcher.group(1)).put(matcher.group(2),rosesValue);
                }


            }
        }

        region.entrySet().stream()
                .sorted((region1,region2)->{
                    long sum1 = region1.getValue().values().stream()
                            .mapToLong(e->e).sum();
                    long sum2 = region2.getValue().values().stream()
                            .mapToLong(e->e).sum();
                    if(sum1==sum2){
                        return region1.getKey().compareTo(region2.getKey());
                    }
                    return Long.compare(sum2,sum1);

                })
                .forEach(x->{
                    System.out.println(x.getKey());
                    x.getValue().entrySet().stream()
                            .sorted((a,b)->{
                        if(Long.compare(a.getValue(),b.getValue())==0){
                            return a.getKey().compareTo(b.getKey());
                        }
                        return Long.compare(a.getValue(),b.getValue());
                            })
                            .forEach(b-> System.out.printf("*--%s | %d%n",b.getKey(),b.getValue()));
                });

    }
}
