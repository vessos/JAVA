import java.util.LinkedHashMap;
import java.util.Scanner;

public class aMinersTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String,Long>minerTask = new LinkedHashMap<>();

        while(true){
            String product = scanner.nextLine();
            if(product.equals("stop")){
                break;
            }
            Long quantity = Long.parseLong(scanner.nextLine());

            if(!minerTask.containsKey(product)){
                minerTask.put(product,quantity);
            }else{
                long sum = minerTask.get(product)+quantity;
                minerTask.put(product,sum);
            }



        }
        for (String key : minerTask.keySet()) {
            System.out.println(key+" -> "+minerTask.get(key));
        }
    }
}
