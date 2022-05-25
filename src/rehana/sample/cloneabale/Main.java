package rehana.sample.cloneabale;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp = new Employee("abc",98,30000,"hyd");
        emp.printdetails();
         Employee e = (Employee) emp.getclone();
         e.printdetails();

    }
}
