package Dinesh202270.main;

import Dinesh202270.abstraction.Abstraction;
import Dinesh202270.abstraction.NewClass;
import Dinesh202270.exceptions.CustomerClass;
import Dinesh202270.taggedinterface.CheckedException;

public class MainMethod {
    public static void main(String[] args) {

        NewClass newClass = new NewClass();

        newClass.Method1();
        newClass.method2();
        newClass.method3();
        newClass.method4();
        newClass.method5();

        Abstraction abstraction = new NewClass();
        System.out.println(abstraction.method2());


        CustomerClass customerClass = new CustomerClass();

        customerClass.customer1();

        try {
            customerClass.customer2();
        } catch (Exception e) {
            System.out.println(" new error is appeared ");
        }


        CheckedException checkedException = new CheckedException();
        System.out.println(checkedException.exception());


    }


    }

