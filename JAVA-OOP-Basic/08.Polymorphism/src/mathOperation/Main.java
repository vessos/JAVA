package mathOperation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        MathOperation math = new MathOperation();
        int resultToParams = math.add(2,2);
        System.out.println(resultToParams);
        System.out.println(math.add(3,2 ,1));

    }

}
