package Vasusample.MainMethod;

/*
import Vasusample.JavaInterfacemarker.Interfacemarker;

public class Main {
    public class MainInterfaceMarker {
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Interfacemarker I = new Interfacemarker("vaasu",1234);
        System.out.println("========interface marker=======");
        System.out.println(I.name);
        System.out.println(I.id);
        I.name = "ravi";
        I.id = 5456;
        System.out.println(I.name);
        System.out.println(I.id);
    }
}
*/

/*
import Vasusample.JavaInterface.BatchFirst;
import Vasusample.JavaInterface.BatchSecond;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========java interface school======");
        BatchFirst b1 = new BatchFirst();
        b1.name();
        b1.rollmumber();
        b1.rollmumber();
        b1.address();
        BatchSecond b2 = new BatchSecond();
        b2.name();
        b2.rollmumber();
        b2.rollmumber();
        b2.address();
    }
}
*/
/*
import Vasusample.Exceptionhandling.CheckedException.CapgeminiEmployee;

public class Main {
    public static void main(String[] args) {
        CapgeminiEmployee capgeminiEmployee = new CapgeminiEmployee();
//        System.out.println(capgeminiEmployee.careerpersentage());
//        System.out.println(capgeminiEmployee.qualification());
        System.out.println("========checked exception========");
        capgeminiEmployee.setAdress("hydaaaaa");
        capgeminiEmployee.setId(2637);
        System.out.println(capgeminiEmployee.getAdress());
        System.out.println(capgeminiEmployee.getId());



        CapgeminiEmployee capgeminiEmployee1 = capgeminiEmployee.getCapgeminiEmployee();
        capgeminiEmployee1.setAdress("hyd");
        capgeminiEmployee1.setId(234325);
        System.out.println(capgeminiEmployee1.getAdress());
        System.out.println(capgeminiEmployee1.getId());
        }
    }
*/


import Vasusample.Exceptionhandling.UnCheckedException.Student;
import Vasusample.Exceptionhandling.UnCheckedException.UnChackedExceptionExample2;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println("======arithmetic exception=====");

        System.out.println(student.getName());
        System.out.println(student.getRollNumber());
        student.Student(55,"iuyt");

        UnChackedExceptionExample2 e2=new UnChackedExceptionExample2();
        System.out.println("======ArrayException======");
        e2.arrayexample();
        System.out.println("vaasu");


    }
}