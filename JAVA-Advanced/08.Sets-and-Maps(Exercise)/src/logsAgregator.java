import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class logsAgregator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String,TreeMap<String,Long>>logs = new TreeMap<>();

        int num = Integer.valueOf(reader.readLine());

        for (int i = 0; i <num ; i++) {

            String[] line = reader.readLine().split(" ");
            String name = line[1];
            String ip = line[0];
            long duration = Long.parseLong(line[2]);

            if(!logs.containsKey(name)){
                logs.put(name,new TreeMap<>());
            }
            if(!logs.get(name).containsKey(ip)){
                logs.get(name).put(ip,0L);
            }
            long sum = logs.get(name).get(ip)+duration;
            logs.get(name).put(ip,sum);

        }
        for (String s : logs.keySet()) {

            System.out.print(s + ": ");
            long summ = 0;

            for (String s1 : logs.get(s).keySet()) {
                summ+=logs.get(s).get(s1);
            }
            System.out.print(summ + " [");

            int count = logs.get(s).size();
            for (String s1 : logs.get(s).keySet()) {
                if(count>1){
                    System.out.print(s1 + ", ");
                    count--;
                }else{
                    System.out.print(s1+ "]");
                }
            }

            System.out.println();
        }
    }
}
