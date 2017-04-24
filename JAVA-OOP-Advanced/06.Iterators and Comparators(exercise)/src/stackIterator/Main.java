package stackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        Stack<Integer>stack = new Stack<>();

        while(!"END".equals(line = reader.readLine())){

            String[]input = line.split("[, ]+");

            String command = input[0];

            switch (command){
                case"Push":
                    Integer[]elements = new Integer[input.length-1];
                    for (int i = 0; i <input.length-1 ; i++) {
                        elements[i]= Integer.valueOf(input[i+1]);
                    }
                    stack.Push(elements);
                    break;
                case"Pop":
                    try{
                        stack.Pop();
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;

            }
        }

        for (Integer integer : stack) {
            System.out.println(integer);
        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }
}
