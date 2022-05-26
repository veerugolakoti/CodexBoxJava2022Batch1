package Sohail.sample.main;

import Sohail.sample.Interface.Tiger;
import Sohail.sample.Javatraining.DuplicateArray;
import Sohail.sample.exceptionhandling.CheckedException;
import Sohail.sample.exceptionhandling.MyException;
import Sohail.sample.exceptionhandling.UncheckedException;
import Sohail.sample.singleTon.SingleTonClass;

public class MainApplicaton {
    public static void main(String[] args) {
//        Interface Example
     /*   Tiger tiger = new Tiger();
        tiger.sleep();
        tiger.animalSound();*/
//      UncheckedException


//        CheckedException
       /* CheckedException checkedException= new CheckedException();
        checkedException.m1();*/
//        UncheckedException
       /* UncheckedException uncheckedException = new UncheckedException();
        uncheckedException.method1();*/
//      MyException
       /* try {
            throw new MyException("I am under Try");
        } catch (MyException e) {
            System.out.println("I am under catch ");;
        }*/
//          Singleton
       /* SingleTonClass x =  SingleTonClass.y();
        SingleTonClass X1= SingleTonClass.y();
        SingleTonClass x2=SingleTonClass.y();
        System.out.println(x);
        System.out.println(X1);
        System.out.println(x2);*/
//      Duplicate Array
        DuplicateArray duplicateArray = new DuplicateArray();
        duplicateArray.m2();


    }
}
