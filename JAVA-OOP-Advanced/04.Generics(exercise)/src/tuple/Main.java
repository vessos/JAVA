package tuple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <3 ; i++) {

            String[] line = reader.readLine().split(" ");
            if(line.length==3){
                String name = line[0]+ " "+line[1];
                Tuple<String,String> tuple = new Tuple(name,line[2]);
                System.out.println(tuple);
            }else{
                String pattern = "[0-9]+";
                if(!line[0].matches(pattern)){
                    String name = line[0];
                    int num = Integer.valueOf(line [1]);
                    Tuple<String,Integer> tuple = new Tuple(name,num);
                    System.out.println(tuple);
                }else{
                    int int1 =Integer.valueOf(line[0]);
                    double doub1 = Double.valueOf(line[1]);
                    Tuple<Integer,Double> tuple = new Tuple(int1,doub1);
                    System.out.println(tuple);
                }
            }
        }
    }
}
