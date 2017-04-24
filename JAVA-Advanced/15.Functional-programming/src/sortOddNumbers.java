import org.omg.CORBA.Object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;

public class sortOddNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[]input = reader.readLine().split(", ");
        ArrayList<Integer>numbers = new ArrayList<>();

        for (String s : input) {
            numbers.add(Integer.valueOf(s));
        }
        numbers.removeIf((n)->n%2!=0);
        StringBuilder sb = new StringBuilder();

        for (Integer number : numbers) {
            sb.append(number);
            sb.append(", ");
        }
        if(sb.length()>0){
            sb.delete(sb.length()-2,sb.length());
        }

        System.out.println(sb);

        numbers.sort((a,b)->a.compareTo(b));
        sb = new StringBuilder();
        for (Integer number : numbers) {
            sb.append(number);
            sb.append(", ");
        }
        if(sb.length()>0){
            sb.delete(sb.length()-2,sb.length());
        }
        System.out.println(sb);
    }

}
