package Nagarjuna.Clone;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeException exception=new EmployeeException();
        System.out.println(exception.empno);
        System.out.println(exception.empName);
       EmployeeException emp1=exception.myException();
        emp1.empno=124;
        emp1.empName="mani";
        System.out.println(emp1.empno);
        System.out.println(emp1.empName);

    }
}
