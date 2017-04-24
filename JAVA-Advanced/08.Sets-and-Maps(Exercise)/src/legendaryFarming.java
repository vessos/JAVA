import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class legendaryFarming {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String,Long> legendary = new TreeMap<>();
        legendary.put("shards",0L);
        legendary.put("fragments",0L);
        legendary.put("motes",0L);
        TreeMap<String,Long> junk = new TreeMap<>();
        String legendaryBuild = "";

        while(true){
            String[] line = reader.readLine().split(" ");
            if(line.length<2){
                break;
            }
            boolean isItLegendary = false;

            for (int i = 0; i <line.length ; i+=2) {

                long quantity = Long.parseLong(line[i]);
                String material = line[i+1].toLowerCase();

                if ((!"shards".equals(material)) && (!"fragments".equals(material)) && (!"motes".equals(material))) {

                    if(!junk.containsKey(material)){
                        junk.put(material,0L);
                    }

                    long coutOfJunk = junk.get(material)+quantity;
                    junk.put(material,coutOfJunk);
                }else{

                    long coutOfmaterial = legendary.get(material)+quantity;
                    if(coutOfmaterial>=250){
                        long remainingMaterial = coutOfmaterial-250;
                        legendaryBuild =material;
                        legendary.put(material,remainingMaterial);
                        isItLegendary = true;
                        break;
                    }
                    legendary.put(material,coutOfmaterial);
                }

            }
            if(isItLegendary){
                break;
            }

        }

        switch(legendaryBuild){
            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
                default: break;
        }

        legendary.entrySet().stream()
                .sorted((a,b)->{
                    if(a.getValue()!=b.getValue()){
                        return Long.compare(b.getValue(),a.getValue());
                    }else{
                        return a.getKey().compareTo(b.getKey());
                    }
                })
                .forEach(x-> System.out.println(x.getKey() + ": " + x.getValue()));

        for (String s : junk.keySet()) {

            System.out.println(s + ": " + junk.get(s));
        }
    }
}
