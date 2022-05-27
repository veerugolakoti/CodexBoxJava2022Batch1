package rajat.sample.collection;

import java.util.ArrayList;
import java.util.List;

public class ApplyMethodsOnLinkedList {
    public void executeDifferentMethod() {
        List<String> student1 = new ArrayList<>();
        student1.add("Rajat");
        student1.add("Junu");
        student1.add("Swati");
        student1.add("Kalu");

        List<String> student = new ArrayList<>();
        student.add("Rajat");
        student.add("Junu");
        student.add("Swati");
        student.add("Kalu");
        student.add("Divya");
        student.add("Junu");
        student.add("Ganesh");
        student.add("Kalu");
        student.add("Junu");
        student.add("Abhilash");
        student.add("Junu");
        student.add("Rajat");
        student.add("vamshi");
        System.out.println(student.equals(student1));
    }
}