import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Path studentsDataPath = Paths.get("StudentData.txt");
        List<String> data =new ArrayList<>();

        try{
            data= Files.readAllLines(studentsDataPath);
        }catch(IOException e){
            e.printStackTrace();
        }

        List<Student> students = new ArrayList<>();
        for (int i = 1; i <data.size() ; i++) {
            String[]tokens = data.get(i).split("\\s+");
            String facNum = tokens[0];
            String firstNane = tokens[1];
            String lastName = tokens[2];
            String email = tokens[3];
            Integer age = Integer.valueOf(tokens[4]);
            Integer group = Integer.valueOf(tokens[5]);
            String phone = tokens[10];
            List<Integer>grades = new ArrayList<>();
            Arrays.stream(tokens).skip(6).limit(4).map(Integer::valueOf).forEach(grades::add);
            Student student = new Student(facNum,firstNane,lastName,email,age,group,phone, grades);

//            for (int gradeIndex = 6; gradeIndex <=9 ; gradeIndex++) {
//                Integer grade = Integer.valueOf(tokens[gradeIndex]);
//                student.getGrades().add(grade);
//            }

            students.add(student);

        }
            // 1.Student by group

//        students.stream()
//                .filter(x->x.getGroup()==2)
//                .sorted((s1,s2)->s1.getFirstName().compareTo(s2.getFirstName()))
//                .forEach(x-> System.out.println(x.getFirstName()+ " "+x.getLastName()));

           //2.Student by firstName and lastName

//        students.stream()
//                .filter(x->x.getFirstName().compareTo(x.getLastName())<0)
//                .forEach(x-> System.out.println(x.getFirstName() + " " + x.getLastName()));

          //3.Students by Age

//        students.stream()
//                .filter(x->x.getAge()>=18 && x.getAge()<=24)
//                .forEach(x-> System.out.println(x.getFirstName() + " " + x.getLastName() + " " + x.getAge()));

        //4.Sort Students

//        Comparator<Student>lastAscending = (a,b)->a.getLastName().compareTo(b.getLastName());
//
//        Comparator<Student> StudentComparator =
//                lastAscending
//                   .thenComparing((a,b)->b.getFirstName().compareTo(a.getFirstName()));
//         students.stream()
//                 .sorted(StudentComparator)
//                 .forEach(x-> System.out.println(x.getFirstName() + " " + x.getLastName()));

        //5.Filter Students bu email domain

//          students.stream()
//                  .filter(x->x.getEmail().endsWith("gmail.com")
////                      String[] email = x.getEmail().split("@");
////                       return email[1].equals("gmail.com");
//                  )
//                  .forEach(x-> System.out.println(x.getFirstName() + " " + x.getLastName() + " " + x.getEmail()));

        //6.Filter students by phone

//             students.stream()
//                     .filter(x->x.getPhone().startsWith("02")||x.getPhone().startsWith("+3592"))
//                     .forEach(x-> System.out.println(x.getFirstName() + " "
//                     +x.getLastName() + " "
//                     + x.getPhone()));

        //7.Excellent Students

//                students.stream()
//                        .filter(grade -> grade.getGrades().contains(6))
//                        .forEach(x -> {
//                            System.out.print(x.getFirstName() + " " + x.getLastName()+ " ");
//                            x.getGrades().stream().sorted((g1,g2) -> Integer.compare(g2, g1))
//                                    .forEach(g -> System.out.print(g + " "));
//                            System.out.println();
//
//                        });

        //8.Weak Students

//                students.stream()
//                        .filter(x->x.getGrades().stream().filter(g->g<=3).count()>=2)
//                        .sorted((x1,x2)->Integer.compare(
//                                x1.getGrades().stream().mapToInt(Integer::valueOf).sum(),
//                                x2.getGrades().stream().mapToInt(Integer::valueOf).sum()))
//                        .forEach(x->{
//                            System.out.printf("%s %s ",x.getFirstName(),x.getLastName());
//                            x.getGrades().stream()
//                                    .sorted()
//                                    .forEach(o-> System.out.print(o + " "));
//                            System.out.println();
//                        });

        //9.Students by Enrollment Year

//        Map<Integer,List<Student>> studentByYear = students.stream()
//                .collect(Collectors.groupingBy(s->Integer.valueOf(
//                        s.getFacultyNumber().substring(s.getFacultyNumber().length()-2)
//                )));
//
//        studentByYear.entrySet().stream()
//                .sorted((y1,y2)->Integer.compare(y1.getKey(),y2.getKey()))
//                .forEach(x->{
//                    System.out.println("20"+x.getKey()+":");
//                    x.getValue().stream()
//                            .sorted(Comparator.comparing(Student::getFirstName)
//                            .thenComparing(Student::getLastName))
//                            .forEach(s-> System.out.println("-- "+s.getFirstName()+" "+s.getLastName()));
//                });


    }
}
