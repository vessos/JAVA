import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class balancedParentheses {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]input = reader.readLine().split("");
        ArrayDeque<String>queue = new ArrayDeque<>();

        boolean isUnique=true;
        if(input.length!=0&&input.length%2==0){
            for (int i = 0; i <input.length ; i++) {
                if(input[i].equals("(")||
                        input[i].equals("{")||
                        input[i].equals("[")){
                    queue.push(input[i]);
                }else{
                    String  element = queue.pop();
                    if(!((element.equals("(")&&input[i].equals(")"))||
                            (element.equals("[")&&input[i].equals("]"))||
                            (element.equals("{")&&input[i].equals("}")))){
                        isUnique=false;
                        break;
                    }
                }

            }
        }else{
            isUnique=false;
        }


        if(isUnique){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }






    }
}
