import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class handsOfCards {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, HashSet<String>> handsOfCards = new LinkedHashMap<>();
        List<Character> smalCard = new ArrayList<>();
        Collections.addAll(smalCard, '2', '3', '4', '5', '6', '7', '8', '9');
        String line = "";

        while (!"JOKER".equals(line = reader.readLine())) {

            String[] player = line.split(": ");
            String[] cards = player[1].split(", ");


            for (String card : cards) {
                if (!handsOfCards.containsKey(player[0])) {

                    handsOfCards.put(player[0], new HashSet<>());
                }

                handsOfCards.get(player[0]).add(card);
            }
        }

        for (String key : handsOfCards.keySet()) {

            int sum = 0;

            for (String vall : handsOfCards.get(key)) {

                sum += simulator(vall, smalCard);

            }

            System.out.println(key + ": " + sum);

        }
    }

    private static int simulator(String vall, List<Character> smalCard) {
        int sumator = 0;
        int sum = 0;

        if (smalCard.contains(vall.charAt(0))) {
            sumator = Character.getNumericValue(vall.charAt(0));
        }else if('A'==vall.charAt(0)){
            sumator=14;
        }
        else if ('J'==vall.charAt(0)) {
            sumator = 11;
        } else if ('Q'==vall.charAt(0)) {
            sumator = 12;
        } else if ('K'==vall.charAt(0)) {
            sumator = 13;
        } else {
            sumator = 10;
        }
        char get = 'a';
        if(vall.length()==2){
            get=vall.charAt(1);
        }else{
            get=vall.charAt(2);
        }
        switch (get) {
            case 'S':
                sum += sumator * 4;
                break;

            case 'H':
                sum += sumator * 3;
                break;

            case 'D':
                sum += sumator * 2;
                break;
            case 'C':
                sum += sumator;
                break;
        }
        return sum;
    }
}
