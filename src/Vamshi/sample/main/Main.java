package Vamshi.sample.main;

import TejaAravind.singleton.Singleton;
import Vamshi.sample.cloneable.Truck;
import Vamshi.sample.singleton.Singleton1;

public class Main {
    // singleton code
  /*  Singleton1 singleton2 = Singleton1.getSingleton();
    Singleton1 singleton1 = Singleton1.getSingleton();
    System.out.println(singleton1);
    System.out.println(singleton2);*/

    public static void main(String[] args){
        //cloneable code
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
            System.out.println("we can't create copy");
        }
    }
}
