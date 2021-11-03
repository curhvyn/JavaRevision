import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lecturer {
    private String lecturer_name;

    public void setCourse(Course course) {
        this.course = course;
    }

    private Course course;

    public String getLecturer_name() {
        return lecturer_name;
    }

    public Course getCourse() {
        return course;
    }

    public Lecturer(String name){
        this.lecturer_name = name;
    }

    private List<Lab1.Student> students = new ArrayList<>();

    public List<Lab1.Student> getStudents(){

        return students;
    }
    public void enter(Lab1.Student student){

        students.add(student);
    }

    Double getHighestAverageGrade(){
        return   students.stream()
                .max(Comparator.comparing(Lab1.Student::getAverageGrade)).get().getAverageGrade();

    }
}

