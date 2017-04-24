import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class teroristWinTest {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String data = reader.readLine();

        StringBuilder damageArea  =new StringBuilder(data);

        int firstIndex = 0;

        int secondIndex = 0;

        while(true){

            if(secondIndex==0){
                firstIndex = data.indexOf("|");
            }else{
                firstIndex = data.indexOf("|",secondIndex+1);
            }

            secondIndex = data.indexOf("|",firstIndex+1);

            if(firstIndex==-1||secondIndex==-1){
                break;
            }

            String bomb = data.substring(firstIndex+1,secondIndex);
            int sum = 0 ;

            for (char c : bomb.toCharArray()) {
                sum+=(int)(c);
            }
            int damage = sum%10;
            int first = firstIndex-damage;

            if(first<0){
                first=0;
            }
            int second = secondIndex+damage;

            if(second>data.length()){
                second=data.length()-1;
            }
            String damm = data.substring(first,second+1);
            damm  = damm.replaceAll(".","\\.");
            damageArea.replace(first,second+1,damm);


        }
        System.out.println(damageArea);

    }
}
