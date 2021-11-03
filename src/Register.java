package Lab4;

import Lab2.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Register {
//    private List<Nameable> nameables;

   public List<String> getRegister(List<Nameable> nameables) {
        return nameables.stream().map(n->n.getName()).collect(Collectors.toList());
    }


}
