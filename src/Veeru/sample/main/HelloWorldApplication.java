package Veeru.sample.main;

import Veeru.sample.abstraction.EmployeesAbstraction;
import Veeru.sample.employee.CodexBoxEmployee;
import Veeru.sample.employee.GoogleEmployee;


public class HelloWorldApplication {

    public static void main(String[] args)  {
        EmployeesAbstraction abstraction = new CodexBoxEmployee();
        System.out.println(abstraction.qualification());

        abstraction = new GoogleEmployee();
        System.out.println(abstraction.qualification());

    }


}
