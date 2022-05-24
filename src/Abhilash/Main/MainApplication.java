package Abhilash.Main;

import Abhilash.exceptionhandling.CustomExceptionExample;
import Abhilash.exceptionhandling.UsingFinally;
import Abhilash.exceptionhandling.UsingFinallyAndSystem_exit;
import Abhilash.exceptionhandling.Number;
import Abhilash.inheritanceExample.Inheritance_Impl;
import Abhilash.interfaceEx.Employee;
import Abhilash.interfaceEx.InterfaceExample;

public class MainApplication {
    public static void main(String[] args) {
        CustomExceptionExample customExceptionExample = new CustomExceptionExample();
        UsingFinallyAndSystem_exit usingFinallyAndSystem_exit = new UsingFinallyAndSystem_exit();
        Number number = new Number();
        System.out.println("\"Number.class output\"");
        number.arithmeticExample();
        System.out.println("\"inheritance example output\"");
        Inheritance_Impl inheritance_ = new Inheritance_Impl();
        inheritance_.Student();
        inheritance_.employee();
        //System.out.println("\" Custom Exception Example\"");
       // System.out.println("\" Pattern Example\"");
       // PatternExample patternExample = new PatternExample();
       // patternExample.pattern();
//        try {
//            System.out.println(customExceptionExample.getMessage());
//            System.out.println("a is having null value");
//            System.out.println(usingFinallyAndSystem_exit.finallyUsage());
//
//        }
//        catch(Exception e){
//            System.out.println("exception");
//        }
        System.out.println("\"InterfaceEx package output\"");
        InterfaceExample interfaceExample = new InterfaceExample();
        interfaceExample.s = "CODEX BOX";
        System.out.println("Actual data is: " + interfaceExample.s);
        InterfaceExample s1 = null;

        try {
            System.out.println("\" Employee \"");
            Employee employee = (Employee) interfaceExample.getInterfaceExample();
            employee.detalis();
        } catch (ClassCastException ex) {
            System.out.println("I'm intended to get Classcast exception");
        }
//        catch (CloneNotSupportedException e) {
//            System.out.println("I'm intended to get CloneNotSupportedException exception");
//        }

        interfaceExample.s = "Hyderbad";
        System.out.println("Cloned data is:" + interfaceExample.s);

        UsingFinally usingFinally = new UsingFinally();
        usingFinally.finallyEx();

    }
}
