package renuprojects.main;

import renuprojects.exceptionhandling.ArrayIndexExceptionEx;
import renuprojects.exceptionhandling.NullPointerExceptionEx;

public class MainApplication {
    public static void main(String[] args) throws CloneNotSupportedException {
       /* CheckedException checkedException=new CheckedException();
        checkedException.run();
        checkedException.jump();
        CheckedException checkedException2=(CheckedException) checkedException.getCheckedException();
        checkedException2.run();
        checkedException2.getCheckedException();
        System.out.println("it is checked exception");*/


        //System.out.println("===============Interfaces Output=====================");

        /*Cat cat = new Cat();
        cat.run();
        cat.jump();*/



       /* MarkerInterfaceExample marker1 = new MarkerInterfaceExample(111, "Renu", "Hyd");
        System.out.println(marker1.id);
        MarkerInterfaceExample marker2 = (MarkerInterfaceExample) marker1.getMarkerInterface();
        System.out.println(marker2.id);
        System.out.println(marker2.name);
        System.out.println(marker2.address);
*/


      /* NullPointerExceptionEx nullPointerException=new NullPointerExceptionEx();
       nullPointerException.methodEx();
       */

        ArrayIndexExceptionEx exception=new ArrayIndexExceptionEx();
        exception.array();


    }

}
