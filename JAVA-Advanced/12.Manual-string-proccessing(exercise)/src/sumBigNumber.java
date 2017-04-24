import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class sumBigNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] num1 = reader.readLine().split("");
        String[] num2 = reader.readLine().split("");

        ArrayDeque<Integer> reminder = new ArrayDeque<>();
        StringBuilder sumNumber = new StringBuilder();

        int minLenght = Math.min(num1.length,num2.length);

        for (int i = 0; i <minLenght ; i++) {

            if(reminder.isEmpty()){
                int sum = Integer.valueOf(num1[num1.length-i-1])+Integer.valueOf(num2[num2.length-i-1]);
                if(sum>9){
                    reminder.offer(sum/10);
                    sumNumber.append((sum%10));
                }else{
                    sumNumber.append(sum);
                }
            }else{
                int remind = reminder.poll();
                int sum = Integer.valueOf(num1[num1.length-i-1])+Integer.valueOf(num2[num2.length-i-1])+remind;
                if(sum>9){
                    reminder.offer(sum/10);
                    sumNumber.append(sum%10);
                }else{
                    sumNumber.append(sum);
                }
            }
        }
        if(num1.length>num2.length){
            for (int i = num1.length-minLenght-1; i >=0 ; i--) {
                if(!reminder.isEmpty()){
                    int remind = reminder.poll();
                    int sum = remind+Integer.valueOf(num1[i]);
                    if(sum>9){
                        reminder.offer(sum/10);
                        sumNumber.append((sum%10));
                    }else{
                        sumNumber.append(sum);
                    }

                }else{
                    sumNumber.append(num1[i]);
                }
            }
        }else if(num2.length>num1.length){
            for (int i = num2.length-minLenght-1; i >=0 ; i--) {
                if(!reminder.isEmpty()){
                    int remind = reminder.poll();
                    int sum = remind+Integer.valueOf(num2[i]);
                    if(sum>9){
                        reminder.offer(sum/10);
                        sumNumber.append((sum%10));
                    }else{
                        sumNumber.append(sum);
                    }
                }else{
                    sumNumber.append(num2[i]);
                }
            }
        }
        if(!reminder.isEmpty()){
            sumNumber.append(reminder.poll());
        }
        String rezult = sumNumber.reverse().toString();
        System.out.println(rezult);

    }
}
