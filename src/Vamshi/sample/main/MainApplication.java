package Vamshi.sample.main;

import Vamshi.sample.listexample.Car;
import Vamshi.sample.listexample.CollegeStudent;
import Vamshi.sample.listexample.Employee;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
   /* public static void main(String[] args) {
        // singleton code
    Singleton1 singleton2 = Singleton1.getSingleton();
    Singleton1 singleton1 = Singleton1.getSingleton();
    System.out.println(singleton1);
    System.out.println(singleton2);
    }*/


   /*     //cloneable code
        Truck t = new Truck(123456789,"TS01EH4444", "Black");
        System.out.println("chassis number of truck : "+t.number);
        System.out.println("registration number : " +t.numberplate);
        System.out.println("colour code of truck : " +t.color);
        try {
            Truck t1 =(Truck)t.clone();
            System.out.println("chassis number of truck "+t.number);
            System.out.println("registration number : " +t.numberplate);
            System.out.println("colour code of truck : " +t.color);
        } catch (CloneNotSupportedException e) {
            System.out.println("we can't create copy ");
        }
    }*/


  /* public static void main(String[] args) {
       // Interfaces
       Bike bike1 = new Benelli();
       System.out.println(bike1.EngineCC());
       System.out.println(bike1.RPM());
       Bike bike2 = new Ducati();
       System.out.println(bike2.EngineCC());
       System.out.println(bike2.RPM());
   }*/

/*
       public static void main(String[] args) {
           //checkedException
           Employee emp = new Employee();
           try{
               int div = (emp.getJava1()+emp.getReactjs())/emp.getTraining();
               System.out.println(""+div);
           }
           catch (ArithmeticException e){
               try {
                   throw new CheckUserException(e.getMessage());
               } catch (CheckUserException ex) {
               }
           }
       }*/
  /*         public static void main(String[] args) {
               //Unchecked Exception
               Employee emp = new Employee();
               emp.employee();
               //System.out.println(emp.);

}
*/
  /*          public static void main(String[] args) {
                Car BMW4 = new Car();
                Integer.parseInt(BMW4.setEngine("v6"));
                BMW4.setHorsepower("375kw");
                BMW4.setSpeed(400);
                List<Car> list= new ArrayList<>();
                list.add(BMW4);
                for(Car BMW :list)
                System.out.println(BMW.getEngine());

}*/

    public static void main(String[] args) {
 /*       Employee employee = new Employee();
        employee.TestEmployeeList();

    }

}*/
        CollegeStudent student = new CollegeStudent();
        student.testExample1();

    }
}
