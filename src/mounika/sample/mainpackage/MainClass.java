package mounika.sample.mainpackage;

import mounika.sample.TrycatchFinally;
import mounika.sample.carExampleCloneable;
import mounika.sample.exceptionhandling.CheckedException;

public class MainClass {


    public static void main(String[] args) {

        carExampleCloneable obj = new carExampleCloneable();
        try {
            carExampleCloneable obj2 = new carExampleCloneable();


        } finally {
            System.out.println("something is wrong");
        }

        CheckedException checkedException = new CheckedException();
        checkedException.division();

        TrycatchFinally TrycatchFinally = new TrycatchFinally();
        TrycatchFinally.hashCode();





 }








    }
























