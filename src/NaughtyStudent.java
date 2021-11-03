package Lab2;

import java.util.ArrayList;

public class NaughtyStudent extends Student {

    public NaughtyStudent(String student_name, ArrayList<Double> grades) {
        super(student_name, grades);
    }

    @Override
    public double getAverageGrade() {
        return super.getAverageGrade()*1.1;
    }
}

