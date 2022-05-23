package Veeru.sample.main;

import Veeru.sample.abstraction.EmployeesAbstraction;
import Veeru.sample.employee.CodexBoxEmployee;
import Veeru.sample.employee.GoogleEmployee;
import Veeru.sample.impls.TaggedInterfaceExample;
import rajat.sample.employee.Employee;


public class HelloWorldApplication {
    protected TaggedInterfaceExample taggedInterfaceExample;
    public static void main(String[] args) throws CloneNotSupportedException {
        GoogleEmployee googleEmployee = new GoogleEmployee();
        googleEmployee.setEmployeeId(1l);
        googleEmployee.setAddress("hyd");
        GoogleEmployee googleClonedEmployee = googleEmployee.getGoogleEmployee();

       if (googleClonedEmployee != null) {
           googleClonedEmployee.setAddress("Ameerpet");
           googleClonedEmployee.setEmployeeId(2l);
       }

    }
}
