package Nagarjuna.ExceptionHandling;

public class AirthemeticException {
    public static void main(String[] args) {
        try {
            int a=100,b=0,c;
            c=a/b;
            System.out.println("result "+c);
        }
        catch (Exception e) {
            System.out.println("my exception is Airthmetic exception "+e);
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

