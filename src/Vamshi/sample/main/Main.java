package Vamshi.sample.main;

import TejaAravind.singleton.Singleton;
import Vamshi.sample.cloneable.Truck;
import Vamshi.sample.exceptionalhandling.CheckUserException;
import Vamshi.sample.exceptionalhandling.Employee;
import Vamshi.sample.interfaces.Benelli;
import Vamshi.sample.interfaces.Bike;
import Vamshi.sample.interfaces.Ducati;
import Vamshi.sample.singleton.Singleton1;

public class Main {
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
           public static void main(String[] args) {
               //Unchecked Exception
               Employee emp = new Employee();
               emp.employee();
               //System.out.println(emp.);

}

}



