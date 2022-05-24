package Nagarjuna.ExceptionHandling;

public class AirthemeticException {


    public static void main(String[] args) throws ArithmeticException{
        try {
            int a=20,b=0,c;
            c=a/b;
            System.out.println("print try block "+c);
        }catch (ArithmeticException e) {
            System.out.println("print catch block"+e.getMessage());

        }

    }
}






       /* try {
            int[] a = {12, 4, 6, 7, 7};
            int i = a[6];
        } catch (Exception e) {
            System.out.println("Array index out of exception"+e);
        }
    }
}*/
       /* try {
            int i = Integer.parseInt("nag");
            System.out.println(i);

        } catch (Exception e) {
            System.out.println("number format exception "+e);
        }
    }
}
*/