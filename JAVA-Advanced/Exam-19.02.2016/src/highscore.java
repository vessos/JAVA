import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class highscore {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^([0-9]+) ([A-Za-z0-9]+)<->([A-Za-z0-9]+) ([0-9]+)$");

        LinkedHashMap<String,BigInteger>totalPoint = new LinkedHashMap<>();
        LinkedHashMap<String,List<String>>playerPoint = new LinkedHashMap<>();

        String line = "";

        while(!"osu!".equals(line = reader.readLine())){

            Matcher matcher = pattern.matcher(line);

            if(matcher.find()){

                String oponent1 = matcher.group(2);
                long score1 = Long.valueOf(matcher.group(1));
                String oponent2 = matcher.group(3);
                long score2 = Long.valueOf(matcher.group(4));
                long oponent1score = score1-score2;
                long oponent2score = score2-score1;

                if(!totalPoint.containsKey(oponent1)){
                    totalPoint.put(oponent1,new BigInteger("0"));
                }
                if(!playerPoint.containsKey(oponent1)){
                    playerPoint.put(oponent1, new ArrayList<>());
                }

                if(!totalPoint.containsKey(oponent2)){
                    totalPoint.put(oponent2,new BigInteger("0"));
                }

                if(!playerPoint.containsKey(oponent2)){
                    playerPoint.put(oponent2,new ArrayList<>());
                }
                BigInteger num= new BigInteger(oponent1score+"");
                BigInteger totalValueOponent1 = totalPoint.get(oponent1).add(num);
                totalPoint.put(oponent1,totalValueOponent1);
                String op1 = String.format("*   %s <-> %d",oponent2,oponent1score);
                playerPoint.get(oponent1).add(op1);
                BigInteger num1= new BigInteger(oponent2score+"");
                BigInteger totalValueOponent2 = totalPoint.get(oponent2).add(num1);
                String op2 = String.format("*   %s <-> %d",oponent1,oponent2score);
                totalPoint.put(oponent2,totalValueOponent2);
                playerPoint.get(oponent2).add(op2);

            }
        }
        totalPoint.entrySet().stream()
                .sorted((a,b)->(b.getValue().compareTo(a.getValue())))
                .forEach(x->{
                    System.out.printf("%s - (%d)%n",x.getKey(),x.getValue());
                    if(playerPoint.containsKey(x.getKey())){
                        playerPoint.get(x.getKey()).stream()
                                .forEach(b-> System.out.println(b));
                    }

                });
    }
}
