package customList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        CustomList Nlist = new CustomListImpl();
        while(!"END".equals(line= reader.readLine())){

            String[]input = line.split(" ");
            String command = input[0];

            switch (command){
                case"Add":
                    Nlist.add(input[1]);
                    break;
                case"Remove":
                    Nlist.removable(Integer.valueOf(input[1]));
                    break;
                case"Contains":
                    System.out.println(Nlist.contains(input[1]));
                    break;
                case"Swap":
                    int index1 = Integer.valueOf(input[1]);
                    int index2 = Integer.valueOf(input[2]);
                    Nlist.swap(index1,index2);
                    break;
                case"Greater":
                    System.out.println(Nlist.countGreaterThat(input[1]));
                    break;
                case"Max":
                    System.out.println(Nlist.getMax());
                    break;
                case"Min":
                    System.out.println(Nlist.getMin());
                    break;
                case "Sort":
                    Nlist.sort();
                    break;
                case"Print":
                    System.out.print(Nlist);
                    break;
            }
        }
    }
}
