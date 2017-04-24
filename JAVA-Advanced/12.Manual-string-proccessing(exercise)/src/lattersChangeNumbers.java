import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class lattersChangeNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]words = reader.readLine().split("\\s+");
        double sum = 0;

        for (String word : words) {

            String firstLater  = word.substring(0,1);
            String lastLater = word.substring(word.length()-1);
            double number = Integer.parseInt(word.substring(1,word.length()-1));
            double sum1 = 0 ;
            if(firstLater.equals(firstLater.toUpperCase())){
                  sum1+=(number/alphabeticlalNumber(firstLater));
            }else{
                sum1+=(number*alphabeticlalNumber(firstLater));
            }
            if(lastLater.equals(lastLater.toUpperCase())){
                sum1=sum1-alphabeticlalNumber(lastLater);
            }else{
                sum1=sum1+alphabeticlalNumber(lastLater);
            }
            sum +=sum1;
        }

        System.out.printf("%.2f",sum);


    }
    private static int alphabeticlalNumber (String later){

        String character = later.toLowerCase();

        LinkedHashMap<String,Integer>ch = new LinkedHashMap<String,Integer>(){
            {
                put(new String("a"),1);
                put(new String("b"),2);
                put(new String("c"),3);
                put(new String("d"),4);
                put(new String("e"),5);
                put(new String("f"),6);
                put(new String("g"),7);
                put(new String("h"),8);
                put(new String("i"),9);
                put(new String("j"),10);
                put(new String("k"),11);
                put(new String("l"),12);
                put(new String("m"),13);
                put(new String("n"),14);
                put(new String("o"),15);
                put(new String("p"),16);
                put(new String("q"),17);
                put(new String("r"),18);
                put(new String("s"),19);
                put(new String("t"),20);
                put(new String("u"),21);
                put(new String("v"),22);
                put(new String("w"),23);
                put(new String("x"),24);
                put(new String("y"),25);
                put(new String("z"),26);

            }
        };
        int num = ch.get(character);

        return num;

    }
}
