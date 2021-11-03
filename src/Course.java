import java.util.List;

public class Course {
    private Lecturer lecturer;
    private Year year;
    private List<Student> students;

    public Course(Lecturer lecturer, Year year, List<Student> students) {
        this.lecturer = lecturer;
        this.year = year;
        this.students = students;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public Year getYear() {
        return year;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
