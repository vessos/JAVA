package string;


import java.io.*;

public class serializeCustomObject {
    private final static String output = "/src/resources/course.ser";

    public static void main(String[] args) {

        final String generalPath = System.getProperty("user.dir");

        final String outputPath = generalPath+output;
        final String inputPath = generalPath+output;

        Course course = new Course();
        course.name = "First";
        course.numberOfStudents = 30;

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputPath));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputPath))) {

            oos.writeObject(course);
         Course course1 = (Course)ois.readObject();

            System.out.println(course1.name);
            System.out.println(course1.numberOfStudents);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
