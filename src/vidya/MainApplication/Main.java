package vidya.MainApplication;

import Shiva.Encapsulation.Student;
import vidya.Exception.Exception.CompilerException;
import vidya.Exception.Exception.EmployeeR;
import vidya.Exception.Exception.VidyaChecked;
import vidya.Exception.Exception.VidyaException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      /*  Dog d1 = new Dog();
        d1.eat();
        d1.makeSounds();
        d1.colour();
    }
}*/


       /* Square s1 = new Square ();
        s1.hight() ;
        s1.length();

        Cube c = new Cube();
        c.length();
        c.hight();
    }*/
        //  VidyaException vidyaException = new VidyaException(22, "diksha");
        //  vidyaException.Name();
        //  vidyaException.empId();

//    EmployeeR emp = new EmployeeR();
//     emp.validate(0);
       /* VidyaChecked vidyaChecked = new VidyaChecked(22,"vv");

vidyaChecked.getMessage();*/

        List<Student>studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setName("vidya");
        student1.setAdddress("tkd");
        student1.setMarks(777);

        Student student2 = new Student();
        student2.setName("dhanu");
        student2.setAdddress("snp");
        student2.setMarks(888);


        Student student3 = new Student();
        student3.setName("diksha");
        student3.setAdddress("hyd");
        student3.setMarks(999);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for (Student student:studentList) {
            System.out.println("student name "+student.getName());
            System.out.println("student address "+student.getAdddress());
            System.out.println("student marks" +student.getMarks());
            System.out.println("********************");
        }

        System.out.println(studentList);


    }
}







