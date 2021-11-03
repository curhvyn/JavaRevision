

import Lab4.Nameable;

import java.time.Year;
import java.util.ArrayList;

public class Student implements Nameable {
    private String student_name;
    private int student_id;
    private Year student_year;
   // private ArrayList<Double> grades;

    public Student(String student_name, int student_id, Year student_year/*ArrayList<Double> grades*/) {
        this.student_name = student_name;
        this.student_id = student_id;
        this.student_year = student_year;
        //this.grades = grades;
    }


    public String getStudent_name() {
        return student_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public Year getStudent_year() {
        return student_year;
    }

    public void setStudent_year(Year student_year) {
        this.student_year = student_year;
    }

//    public ArrayList<Double> getGrades() {
//        return grades;
//    }
    public double getAverageGrade()
    {

        double sum = 0;
        for ( double g : grades)
        {
            sum = sum + g;
        }

        double average = 0;
        if (grades.size() > 0)
        {
            average = sum / grades.size();
        }

        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_name='" + student_name + '\'' +
                ", student_id=" + student_id +
                ", student_year=" + student_year +
                ", grades=" + grades +
                '}';
    }

    @Override
    public String getName(){
        return student_name;
    }
}


