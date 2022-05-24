package mounika.sample.mainpackage;

import mounika.sample.TrycatchFinally;
import mounika.sample.carExampleCloneable;
import mounika.sample.exceptionhandling.CheckedException;
import mounika.sample.juice.TypesJuice;
import mounika.sample.mianmethod.MainApplication;

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


        TypesJuice typesJuice = new TypesJuice();
        System.out.println(typesJuice.getTypeJuice());
        System.out.println(typesJuice.getTypesize());

        MainApplication mainApplication = new MainApplication();
        int[] arr = {1, 2, 3,};
        try {
            System.out.println(arr[2]);
            System.out.println(arr[4]);
            System.out.println(arr[2]);
        } catch (Exception e) {
            System.out.println(" something wrong");
            System.out.println("uiytre");
        }
    }}





































