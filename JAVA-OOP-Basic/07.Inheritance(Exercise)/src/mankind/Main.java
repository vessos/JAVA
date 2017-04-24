package mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]students = reader.readLine().split(" ");
        String[]workker = reader.readLine().split(" ");

        String studentFirstName = students[0];
        String studentlastName = students[1];
        String facultyNumber = students[2];

        String workerFirstName = workker[0];
        String workerlastName = workker[1];
        double salary = Double.parseDouble(workker[2]);
        double hour = Double.valueOf(workker[3]);

        try{
            Student student = new Student(studentFirstName,studentlastName,facultyNumber);
            Worker worker = new Worker(workerFirstName,workerlastName,salary,hour);
            System.out.println(student);
            System.out.println();

            System.out.println(worker);
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }


    }
}
