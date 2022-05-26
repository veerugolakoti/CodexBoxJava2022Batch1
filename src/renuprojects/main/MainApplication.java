package renuprojects.main;

import renuprojects.collections.ListExampleOfInteger;

import java.util.ArrayList;
import java.util.List;

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

        /*ArrayIndexExceptionEx exception=new ArrayIndexExceptionEx();
        exception.array();
*/


      /*  try{
            throw new CustomExceptionExample("custom");
        } catch (CustomExceptionExample custom) {
            //throw new RuntimeException(e);
            System.out.println("custom checked exception");
            System.out.println(custom.getMessage());
        }
*/
        /*List<ListExampleOfEmployee> list=new ArrayList<>();

        ListExampleOfEmployee emp1=new ListExampleOfEmployee();
        emp1.setName("ravali");
        emp1.setId(68);
        emp1.setAdd("hyd");
        ListExampleOfEmployee emp2=new ListExampleOfEmployee();
        emp2.setName("jansi");
        emp2.setId(60);
        emp2.setAdd("hyd");
        ListExampleOfEmployee emp3=new ListExampleOfEmployee();
        emp2.setName("swathi");
        emp2.setId(64);
        emp2.setAdd("hyd");

           list.add(emp1);
           list.add(emp2);
           list.add(emp3);

        for (ListExampleOfEmployee employee:list) {
            System.out.println("employee name is :" +employee.getName());
            System.out.println("employee id is :" +employee.getId());
            System.out.println("employee address is :"+employee.getAdd());
            System.out.println("---------------------------------------");

        }
*/



        ListExampleOfInteger listExampleOfInteger=new ListExampleOfInteger();
        listExampleOfInteger.listMethod();







    }

}
