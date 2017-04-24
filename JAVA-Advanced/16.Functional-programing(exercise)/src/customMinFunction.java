

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class customMinFunction {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]input = reader.readLine().split(" ");
        Integer[]nums = new Integer[input.length];
        for (int i = 0; i <input.length ; i++) {
            nums[i]= Integer.parseInt(input[i]);
        }
        Function<Integer[],Integer> minNum = (n)->{

            int num = Integer.MAX_VALUE;
            for (Integer an : n) {
                if(an<num){
                    num=an;
                }
            }
            return num;
        };
        System.out.println(minNum.apply(nums));


    }
}
