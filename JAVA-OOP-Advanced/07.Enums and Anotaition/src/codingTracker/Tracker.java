package codingTracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tracker {

    @Author(name = "Pesho")
    public static void printMethodsByAuthor(){
        Map<String,List<String>> methodByAuthor = new HashMap<>();
        Class<?> trackerClass = Tracker.class;
        Method[] methods= trackerClass.getDeclaredMethods();
        for (Method method : methods) {
           Author annotation =  method.getAnnotation(Author.class);
           if(annotation!=null){
                methodByAuthor.putIfAbsent(annotation.name(),new ArrayList<>());
                methodByAuthor.get(annotation.name()).add(method.getName());
           }
        }

        for (String s : methodByAuthor.keySet()) {
            System.out.printf("%s: %s\n",s,String.join(", ",methodByAuthor.get(s)));
        }
    }
    @Author()
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor();
    }
}
