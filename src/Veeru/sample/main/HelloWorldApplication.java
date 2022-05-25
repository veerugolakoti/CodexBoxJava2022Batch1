package Veeru.sample.main;

import Abhilash.exceptionhandling.Number;
import Veeru.sample.abstraction.EmployeesAbstraction;
import Veeru.sample.employee.CodexBoxEmployee;
import Veeru.sample.employee.GoogleEmployee;
import Veeru.sample.impls.TaggedInterfaceExample;
import rajat.sample.employee.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class HelloWorldApplication {
    protected TaggedInterfaceExample taggedInterfaceExample;
    public static void main(String[] args) {
       /* try {
            String str = "123";
            Long value = Long.parseLong(str);
            throw new IllegalArgumentException("intentional exception");
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Number format exception ");
        } catch (Exception exception) {
            System.out.println("Exception occur");
        }
        System.out.println("Emd of my method");
    }*/

        //Collections Examples
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setEmpAddress("Hyde");
        employee1.setEmpId(1);

        Employee employee2 = new Employee();
        employee2.setEmpAddress("bangalore");
        employee2.setEmpId(2);

        Employee employee3 = new Employee();
        employee3.setEmpAddress("Chennai");
        employee3.setEmpId(3);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        for (Employee employee : list) {
            System.out.println("EmpId : " + employee.getEmpId());
            System.out.println("EmplName : " + employee.getEmpName());
            System.out.println("Emp Address: " + employee.getEmpAddress());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        }


    }
}
