import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class filterByAge {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(reader.readLine());
        LinkedHashMap<String,Integer>names = new LinkedHashMap<>();

        for (int i = 0; i <N ; i++) {
            String[] inputName = reader.readLine().split(", ");
            names.put(inputName[0],Integer.valueOf(inputName[1]));
        }
        String condition = reader.readLine();
        int age = Integer.valueOf(reader.readLine());
        String form = reader.readLine();


        for (String s : names.keySet()) {
            if(condition.equals("younger")){
                if(names.get(s)<age){
                    printer(form,s,names.get(s));
                }
            }else{
                if(names.get(s)>=age){
                    printer(form,s,names.get(s));
                }
            }
        }

    }

    private static void printer (String form,String name , Integer age){
        switch(form){
            case "name age":
                System.out.println(name+" - "+ age);
                break;
            case "name":
                System.out.println(name);
                break;
            case "age":
                System.out.println(age);
        }
    }

}
