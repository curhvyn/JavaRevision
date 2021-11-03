package lAB3;

import Lab2.Student;

import java.util.ArrayList;
import java.util.List;

public class BagOfstudents {
    List<Student> bagOfStudents = new ArrayList<>();

    public void addStudent(Student student){
        bagOfStudents.add(student);
    }

    public void removeStudent(Student student){
        bagOfStudents.remove(student);
    }

    public void clearStudent(){
        bagOfStudents.clear();
    }

}
