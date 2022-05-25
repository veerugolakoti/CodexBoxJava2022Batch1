package Ravaliproject.main;

import Ravaliproject.exceptionhandling.uncheckedexception.ArithmaticException;
import Ravaliproject.exceptionhandling.uncheckedexception.NullpointerException;

public class MainMethod {
    public static void main(String[] args) throws CloneNotSupportedException {

         NullpointerException nullpointerException=new NullpointerException();

        nullpointerException.display();

        ArithmaticException arithmaticException= new ArithmaticException();
        arithmaticException.sum(10,8);

        /*


        CheckedExceptionExmple checkedExceptionExmple=new CheckedExceptionExmple("Renu",78);
        checkedExceptionExmple.getCheckedExceptionExmple1();
        System.out.println(checkedExceptionExmple.name);
        System.out.println(checkedExceptionExmple.id);
        CheckedExceptionExmple checkedExceptionExmple1 = (CheckedExceptionExmple) checkedExceptionExmple.getCheckedExceptionExmple1();
       // System.out.println(checkedExceptionExmple1.getCheckedExceptionExmple1());

        Reema r = new Reema();
        System.out.println(r.name());
        System.out.println(r.id());
        System.out.println(r.salary());
        System.out.println("GTFYGUJYHIU");

        MarkerInterface markerInterface = new MarkerInterface(8,"pooja");
        System.out.println(markerInterface.name);
        System.out.println(markerInterface.id);
        MarkerInterface markerInterface1= (MarkerInterface) markerInterface.myInterfacMethod();
        markerInterface1.name="ravali";
        System.out.println(markerInterface1.name + "actual data");
        System.out.println(markerInterface1.name);

        System.out.println(markerInterface1.id);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your id number");
        int number = scanner.nextInt();
        System.out.println("Enter your mailid");
        String Mailid= scanner.next();
        System.out.println("process completed");
*/

     //   NullPointerException nullPointerException=new NullPointerException();
      //  nullPointerException.getMessage();
    }


    }


