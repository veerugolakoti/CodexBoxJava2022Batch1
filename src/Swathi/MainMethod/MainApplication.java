package Swathi.MainMethod;

import Ravaliproject.interfaces.Employee;
import Swathi.Abstraction.MyClass2;
import Swathi.Interface.InterfaceClass;
import Swathi.MarkerInterfaceEx.Student;
import Swathi.collections.EmployeeDetails;

import java.util.ArrayList;
import java.util.List;



public class MainApplication {
    public static void main(String[] args) {
        //   MyClass2 OBJ=new MyClass2();
        // OBJ.mymethod();
        //  System.out.println(OBJ.getSide()); //*
        //System.out.println("=============== abstracton");


/*
        Student OBJECT = new Student();
        OBJECT.method();
        System.out.println(OBJECT.name);
         }*/
        // System.out.println("========checked exception");

       /* Swathi.MarkerInterfaceEx.Student M1=new Swathi.MarkerInterfaceEx.Student();
        Swathi.MarkerInterfaceEx.Student M2= (Student) M1.getinterfacemethod();
        M1.name="swathi";
        M2.age=23;
        System.out.println(M1.name);
        System.out.println(M2.age);
    }*/
        //System.out.println("=========markerinterface clonable");



        /*InterfaceClass OBJ =new InterfaceClass();
        OBJ.jump();
        OBJ.walk();
        OBJ.write();
*/
        //System.out.println("======interfaces");


        List<EmployeeDetails> List =new ArrayList<>();
        EmployeeDetails zcd= new EmployeeDetails();
        zcd.setName("swathi");
        zcd.setId(23);
        zcd.setAddress("hyderabad");


        EmployeeDetails zcd1= new EmployeeDetails();
        zcd1.setName("jhansi");
        zcd1.setId(235);
        zcd1.setAddress("banglore");


        EmployeeDetails zcd3= new EmployeeDetails();
        zcd3.setName("renu");
        zcd3.setId(23);
        zcd3.setAddress("ooty");

        List.add(zcd);
        List.add(zcd1);
        List.add(zcd3);

        for ( EmployeeDetails  EmployeeDetails:List) {
            System.out.println(" EmployeeDetails:"+ EmployeeDetails.getName());
            System.out.println(" EmployeeDetails:"+ EmployeeDetails.getId());
            System.out.println(" EmployeeDetails:"+ EmployeeDetails.getAddress());

        }


            }
        }

