package Vasu.sample.mainMethod;

import Vasu.sample.ArrayListExample;
import Vasu.sample.collections.Bike;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    // marker interface

    public class MainInterfaceMarker {
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Interfacemarker I = new Interfacemarker("vaasu",1234);
        System.out.println("========interface marker=======");
        System.out.println(I.name);
        System.out.println(I.id);
        I.name = "ravi";
        I.id = 5456;
        System.out.println(I.name);
        System.out.println(I.id);
    }

*/


    public static void main(String[] args) {
        /*
        //java interface school
        System.out.println("=========java interface school======");
        BatchFirst b1 = new BatchFirst();
        b1.name();
        b1.rollmumber();
        b1.rollmumber();
        b1.address();
        BatchSecond b2 = new BatchSecond();
        b2.name();
        b2.rollmumber();
        b2.rollmumber();
        b2.address();
    }

*/



    /*
    //  chacked exception
        CapgeminiEmployee capgeminiEmployee = new CapgeminiEmployee();
//        System.out.println(capgeminiEmployee.careerpersentage());
//        System.out.println(capgeminiEmployee.qualification());
        System.out.println("========checked exception========");
        capgeminiEmployee.setAdress("hydaaaaa");
        capgeminiEmployee.setId(2637);
        System.out.println(capgeminiEmployee.getAdress());
        System.out.println(capgeminiEmployee.getId());



        CapgeminiEmployee capgeminiEmployee1 = capgeminiEmployee.getCapgeminiEmployee();
        capgeminiEmployee1.setAdress("hyd");
        capgeminiEmployee1.setId(234325);
        System.out.println(capgeminiEmployee1.getAdress());
        System.out.println(capgeminiEmployee1.getId());
        }




*/


    /*
        Student student = new Student();
        System.out.println("======arithmetic exception=====");

        System.out.println(student.getName());
        System.out.println(student.getRollNumber());
        student.Student(55, "iuyt");

        UnCheckedExceptionExample2 e2 = new UnCheckedExceptionExample2();
        System.out.println("======ArrayException======");
        e2.arrayexample();
        System.out.println("vaasu");
    }*/

        // collection examples...

        //  Integer example....

        /*List<Integer> list=new ArrayList();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);

        for (Integer num:list)
              {
                  System.out.println(num);

        }
*/

        //   differnet exceptions

       /* try{
            String str="456l";
            Long value=Long.parseLong(str);

        } catch (NumberFormatException numberFormatException) {
            System.out.println("NumberFormatException");
        }
        catch (IllegalArgumentException illegalArgumentException){
            System.out.println("IllegalArgumentException");
        }
        catch (RuntimeException runtimeException){
            System.out.println("RuntimeException");
        }
        catch (Exception exception){
            System.out.println("Exception");
        }*/

        /*// collection example bike

        List<Bike> list=new ArrayList<>();
        Bike fz=new Bike();
        fz.setWheels(2);
        fz.setFuelcapacity(10.5f);
        fz.setCc("150Cc");

        Bike pulsar=new Bike();
        pulsar.setWheels(2);
        pulsar.setFuelcapacity(8.5f);
        pulsar.setCc("220Cc");

        Bike spelnder=new Bike();
        spelnder.setWheels(2);
        spelnder.setFuelcapacity(6.5f);
        spelnder.setCc("100Cc");

        list.add(fz);
        list.add(pulsar);
        list.add(spelnder);

        for (Bike bike :list)
              {
                  System.out.println("Bike wheels:"+bike.getWheels());
                  System.out.println("Bike Fuel capacity:"+bike.getFuelcapacity());
                  System.out.println("Bike Cc:"+bike.getCc());
                  System.out.println("=====================");

        }


*/
        //  Arraylist duplicates



        ArrayListExample arrayListExample=new ArrayListExample();
        arrayListExample.list();
       }

      }





