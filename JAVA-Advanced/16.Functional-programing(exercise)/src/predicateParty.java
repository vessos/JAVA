import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class predicateParty {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = reader.readLine().split(" ");
        String[]commands = reader.readLine().split(" ");
        HashMap<String,Integer>listOfGuests = new HashMap<>();

        for (String name : names) {
            if(!listOfGuests.containsKey(name)){
                listOfGuests.put(name,1);
            }
        }


        String regex1 = String.format("^%s[a-z]*$",commands[2]);
        String regex2 = String.format("^[A-Z][a-z]*%s$",commands[2]);

        while(!"Party!".equals(commands[0])){
            String regex="" ;
            if("StartsWith".equals(commands[1])){
                    regex=regex1;
            }else if("EndsWith".equals(commands[1])){
                    regex=regex2;
            }else{
                    regex=String.format("^[A-Z][a-z]{%d}$",Integer.parseInt(commands[2])-1);
            }
            Pattern pattern1 = Pattern.compile(regex);

            for (String s : listOfGuests.keySet()) {
                Matcher match = pattern1.matcher(s);
                if(match.find()){
                    if("Remove".equals(commands[0])){
                        listOfGuests.put(s,0);
                    }else{
                        int count = listOfGuests.get(s)*2;
                        listOfGuests.put(s,count);
                    }
                }
            }
            commands= reader.readLine().split(" ");
        }

        System.out.println(" ");
    }
}
