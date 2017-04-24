package ClassBoxDataValidation;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

//        Class boxClass = Box.class;
//        Field[] fields = boxClass.getDeclaredFields();
//        System.out.println(Arrays.asList(fields)
//                .stream()
//                .filter(f -> Modifier.isPrivate(f.getModifiers())).count());

        List<Double> parameters = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {

            double param = Double.valueOf(reader.readLine());
            parameters.add(param);
        }
        double length = parameters.get(0);
        double width = parameters.get(1);
        double heigth = parameters.get(2);
        try{
            Box obj = new Box(length,width,heigth);
            System.out.println(obj.toString());
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }



    }


}
