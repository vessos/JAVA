import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userLogs {

    private static Integer counter = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String data = "";
        Pattern pattern = Pattern.compile("^IP=(.+?) message=(.+?) user=([A-Za-z0-9]+)$");

        TreeMap<String,LinkedHashMap<String,Integer>> users = new TreeMap<>();

        while(!"end".equals(data = reader.readLine())){

            Matcher matcher = pattern.matcher(data);

            if(matcher.find()){

                String userName = matcher.group(3);
                String ip = matcher.group(1);

                if(!users.containsKey(userName)){

                    users.put(userName,new LinkedHashMap<>());
                }

                if(!users.get(userName).containsKey(ip)){
                    users.get(userName).put(ip,0);
                }
                int count = users.get(userName).get(ip);
                users.get(userName).put(ip,count+=1);

            }

        }

        int count = 0;
        for (String s : users.keySet()) {

            System.out.println(s + ": ");
            count = users.get(s).size();
            for (String s1 : users.get(s).keySet()) {

                if(count>1){
                    System.out.printf("%s => %d, ",s1,users.get(s).get(s1));
                    count--;
                }else{
                    System.out.printf("%s => %d. ",s1,users.get(s).get(s1));
                }
            }
            System.out.println();
        }

//        users.entrySet().stream()
//                .sorted((a,b)-> a.getKey().compareTo(b.getKey()))
//                .forEach(user->{
//                    System.out.println(user.getKey() + ": ");
//                    user.getValue().entrySet().stream()
//                            .sorted((ip1,ip2)->ip1.getKey().compareTo(ip2.getKey()))
//                            .forEach(x-> {
//
//                                if(counter==users.get(x.getKey()){
//                                    System.out.printf("%s => %d.",x.getKey(),x.getValue());
//                                }else{
//                                    System.out.printf("%s => %d, ",x.getKey(),x.getValue());
//                                    counter++;
//                                }
//                            });
//                    System.out.println();
//                });

    }
}
