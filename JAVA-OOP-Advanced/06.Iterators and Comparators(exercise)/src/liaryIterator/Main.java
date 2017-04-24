package liaryIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        ListyIterator<String>list = null;

        while(!"END".equals(line = reader.readLine())){

            String[]input = line.split(" ");

            switch(input[0]){

                case "Create":
                    String[]elements = Arrays.stream(input)
                            .skip(1L)
                            .toArray(String[]::new);
                    list = new ListyIterator<>(elements);
                    break;
                case "Move":
                    System.out.println(list.Move());
                    break;
                case"Print":
                    try{
                        list.Print();
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
                case"HasNext":
                    System.out.println(list.HasNext());
                    break;
                case"PrintAll":
                    list.PrintAll();
                    break;
            }
        }
    }
}
