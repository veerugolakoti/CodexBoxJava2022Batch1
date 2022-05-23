package Dhivya.sample.exceptionhandling;

public class Employee implements Cloneable
{
    int employeeId;
    String employeeName;
    Employee(int employeeId, String employeeName)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public static void main(String[] args) {
        try {
            Employee employee1 = new Employee(2, "divya");
            Employee employee2 = (Employee) employee1.clone();
            System.out.println(employee1.employeeId + " " + employee1.employeeName);
            System.out.println(employee2.employeeId + " " + employee2.employeeName);
        }
        catch (CloneNotSupportedException e)
        {

        }
    }
}



