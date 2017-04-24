package string;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class serializeArrayList {

    private  final static String output = "/src/resources/list.ser";
    public static void main(String[] args) {

        final String generalPAth = System.getProperty("user.dir");

        final String path = generalPAth+output;

        ArrayList<Double>arr = new ArrayList<>();
        Collections.addAll(arr,3.3,4.1,5.0,6.4);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {

          oos.writeObject(arr);
            List<Double> arr1 = (List<Double>)ois.readObject();
            System.out.println(arr1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

