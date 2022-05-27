package JavaTraining.operators;
import JavaTraining.javaassessment.Students;
import java.util.ArrayList;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {
        Students stud1=new Students();
        stud1.setName("ram");
        stud1.setRollno(101);
        stud1.setGrade(1);

        Students stud2=new Students();
        stud2.setName("ramya");
        stud2.setRollno(102);
        stud2.setGrade(1);

        Students stud3=new Students();
        stud3.setName("rajeev");
        stud3.setRollno(103);
        stud3.setGrade(2);

        List<Students> student= new ArrayList<Students>();
        student.add(stud1);
        student.add(stud2);
        student.add(stud3);
        for (int i = 0; i < student.size() ; i++) {
            if(student.get(i).getGrade()==1){
                System.out.println("grade 1" + student.get(i).getName() + student.get(i).getRollno());
            }

        }

    }
}
