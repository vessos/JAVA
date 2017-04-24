import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringLenght {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder input = new StringBuilder(reader.readLine());
        int strLenght = input.length();


        String s = "*";
        String newString;
        if(strLenght<20){
             newString = new String(new char[20 - input.length()]);
             System.out.println(input.append(newString.replace("\0", "*")));
        }else{
            System.out.println(input.substring(0,20));
        }




    }
}
