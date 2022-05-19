package rajat.sample.constructor;

import rajat.sample.employee.Employee;

public class DefaultConstructorApp {
    DefaultConstructorApp(Employee employee){
        System.out.println(employee.getEmpName());
        System.out.println(employee.getEmpAddress());


    }
    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.setEmpName("Rajat");
        employee.setEmpAddress("PDP");
        DefaultConstructorApp defaultConstructorApp=new DefaultConstructorApp(employee);

    }
}
