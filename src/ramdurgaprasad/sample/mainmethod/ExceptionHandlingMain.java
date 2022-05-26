package ramdurgaprasad.sample.mainmethod;
import ramdurgaprasad.sample.collections.DuplicateStringWithCount;
import ramdurgaprasad.sample.exceptionhandling.ArithmeticEception;
import ramdurgaprasad.sample.exceptionhandling.ArrayIndexBoundofException;

public class ExceptionHandlingMain {
  /*  public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("the values to print:");
        int strength = sc.nextInt();
        System.out.println("the office is ");
        String office= sc.next();
        System.out.println("the salary");
        float salry=sc.nextFloat();
        Taggedinterface ti=new Taggedinterface(29,"codexbox",12500.5f);*/

   /* public static void main(String[] args) {
        ArithmeticEception ae = new ArithmeticEception();
        ae.Displaymethod();*/


//    =============Arrayboundofexception============

/*
   public static void main(String[] args) {
       ArrayIndexBoundofException arrayIndexBoundofException=new ArrayIndexBoundofException();
  arrayIndexBoundofException.Array();
   }
*/


    //   = ====== ====     Duplicate Strings with Count======
    public static void main(String[] args) {


        DuplicateStringWithCount count = new DuplicateStringWithCount();
        count.Duplicate();
    }

    }



