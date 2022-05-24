package Nagarjuna.Clone;

public class EmployeeException implements Cloneable {
    String empName="nag";
    int empno=123;

    EmployeeException myException() {
        EmployeeException emp=null;
        try {
            Object object=clone();
            emp=(EmployeeException) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("The exception occurs at cloneable");;
        }
        return emp;

    }
}

