import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class populationCounter {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String,Long> totalPopulation = new LinkedHashMap<>();
        LinkedHashMap<String,LinkedHashMap<String,Integer>>cities = new LinkedHashMap<>();

        String line = "";

        while(!"report".equals(line = reader.readLine())){

            String[] populationNation = line.split("\\|");
            String country = populationNation[1];
            String town = populationNation[0];
            int citizen = Integer.valueOf(populationNation[2]);

            if(!cities.containsKey(country)){
                cities.put(country,new LinkedHashMap<>());
            }
            if(!totalPopulation.containsKey(country)){
                totalPopulation.put(country,0L);
            }
            cities.get(country).put(town,citizen);
        }

        for (String s : cities.keySet()) {

            long sum = 0 ;

            for (String s1 : cities.get(s).keySet()) {

                sum += cities.get(s).get(s1);

            }
            if(totalPopulation.containsKey(s)){
                totalPopulation.put(s,sum);
            }
        }
        LinkedHashMap<String,Long>sortedCountry = new LinkedHashMap<>();
        totalPopulation.entrySet().stream()
                .sorted((c1,c2)->Long.compare(c2.getValue(),c1.getValue()))
                .forEachOrdered(x->sortedCountry.put(x.getKey(),x.getValue()));

        for (String s : sortedCountry.keySet()) {
            System.out.println(s + " (total population: " + sortedCountry.get(s) + ")");
            cities.entrySet().stream()
                    .forEach(x->{
                        if(x.getKey().equals(s)){
                            x.getValue().entrySet().stream()
                                    .sorted((a,b)->Integer.compare(b.getValue(),a.getValue()))
                                    .forEach(t-> System.out.println("=>"+ t.getKey() + ": " + t.getValue()));
                        }

            });
        }


    }
}
