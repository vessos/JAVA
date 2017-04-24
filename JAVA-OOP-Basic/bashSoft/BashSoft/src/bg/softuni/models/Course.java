package bg.softuni.models;

import bg.softuni.io.OutputWriter;
import bg.softuni.staticData.ExceptionMessages;

import java.util.LinkedHashMap;

public class Course {

    public static final int NUMBER_OF_TASKS_ON_EXAM=5;
    public static final int MAX_SCORE_ON_EXAM_TASK = 100;

    public String name;
    public LinkedHashMap<String,Student>studentByName;

    public Course(String name) {
        this.name = name;
        this.studentByName = new LinkedHashMap<>();
    }

    public void enrollStrudent(Student student){
        if(this.studentByName.containsKey(student.userName)){
            OutputWriter.displayException(String.format(
                    "The %s already exist in %s",
                    student.userName,this.name));
            return;
        }

        this.studentByName.put(student.userName,student);
    }
}
