package Veeru.sample.impls;

import Veeru.sample.abstraction.EmployeesAbstraction;
import Veeru.sample.employee.CodexBoxEmployee;
import Veeru.sample.employee.GoogleEmployee;
import Veeru.sample.interfaces.MyInterface;

public class MyInterfaceImpl implements MyInterface {

    @Override
    public EmployeesAbstraction getEmployeeDetails() {
        EmployeesAbstraction employee = new CodexBoxEmployee();
        employee.setEmployeeId(101l);
        employee.setAddress("Hyderabad");
        employee.setEmpName("veeeru");
        return employee;
    }
}
