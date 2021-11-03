import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student students = List.of(new Student("Michael Alabi", 1, Year.FOURTH, ),
//                new Student("Uwame Yaw", 2, Year.SECOND),
//                new Student("Mike Sam", 3, Year.THIRD),
//                new Student("Ienry Joke", 4, Year.FOURTH),
//                new Student("Iichael One", 5, Year.FOURTH),
//                new Student("Michael Two", 6, Year.FIRST),
//                new Student("Michael Three", 7, Year.FIRST),
//                new Student("Michael Four", 8, Year.FIRST),
//                new Student("Oichael Five", 9, Year.FOURTH),
//                new Student("Michael Six", 10, Year.THIRD)
                );

        List FirstYearStudent = new ArrayList();
        for (Student student : students) {
            if (student.getStudent_year() == Year.FIRST) {
                FirstYearStudent.add(student);
            }
        }
//        System.out.println(FirstYearStudent);

        Lecturer lecturer = new Lecturer("Albee");

       Course IntroToProgramming = new Course(lecturer,Year.FIRST, FirstYearStudent);

        List ThirdAndFourthYearStudent = new ArrayList();
        for (Student student : students) {
            if (student.getStudent_year() == Year.THIRD ||student.getStudent_year() == Year.FOURTH) {
                ThirdAndFourthYearStudent.add(student);
            }
        }
        Course advanceGardening = new AdvanceGardening(lecturer, Year.FOURTH, ThirdAndFourthYearStudent);

        List ForthYearStudentsWithVowels = students.stream().filter(student -> student.getStudent_year().equals(Year.FOURTH) && "aeiou".contains(student.getStudent_name().toLowerCase().substring(0,1))).collect(Collectors.toList());

        System.out.println(ForthYearStudentsWithVowels);

        Course physics = new Course(lecturer,Year.FOURTH,ForthYearStudentsWithVowels) ;

    }
}
