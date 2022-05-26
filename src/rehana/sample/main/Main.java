package rehana.sample.main;

import rehana.sample.exceptionhandling.NumberFormatExceptionClass;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
      /* Employee emp = new Employee("abc",98,30000,"hyd");
        emp.printdetails();
         Employee e = (Employee) emp.getclone();
         e.printdetails();


        ArithmeticException e1 = new ArithmeticException();
        System.out.println("ArithemeticException");
*/
       /* ArrayIndexOutOfBound e2 = new ArrayIndexOutOfBound();
        System.out.println( "Array index out of bounds");

        NullPointerException np = new NullPointerException();
       System.out.println("nullpointerexception");*/

       /* ImmutabilityExample i = new ImmutabilityExample("rehana",19,"thursday");
        System.out.println(i.getName());
        System.out.println(i.getDate());
        System.out.println(i.getDay());*/

        NumberFormatExceptionClass n = new NumberFormatExceptionClass();
        n.getNumberFormatException();

    }
}
