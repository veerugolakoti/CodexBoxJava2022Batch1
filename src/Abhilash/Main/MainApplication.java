package Abhilash.Main;

import Abhilash.collectionExamples.DuplicateExample;
import Abhilash.collectionExamples.Groceries;
import Abhilash.exceptionhandling.CustomExceptionExample;
import Abhilash.exceptionhandling.UsingFinally;
import Abhilash.exceptionhandling.UsingFinallyAndSystem_exit;
import Abhilash.exceptionhandling.Number;
//import Abhilash.fileHandling.Comparison;
import Abhilash.fileHandling.Comparison;
import Abhilash.fileHandling.FirstFile;
import Abhilash.inheritanceExample.Inheritance_Impl;
import Abhilash.interfaceExamples.Employee;
import Abhilash.interfaceExamples.InterfaceExample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        //CustomExceptionExample customExceptionExample = new CustomExceptionExample();
       // UsingFinallyAndSystem_exit usingFinallyAndSystem_exit = new UsingFinallyAndSystem_exit();
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

        System.out.println("\" File handling output \"");
        FirstFile firstFile = new FirstFile();
        System.out.println(firstFile.getFile());

        System.out.println("\"comparison\"");
        Comparison comparison = new Comparison();
        comparison.comparison();
        // collection examples package
        Groceries groceries = new Groceries();
        Groceries groceries1 = new Groceries();
        List<Groceries> list = new ArrayList<>();
        groceries.setVeggies("brinjal");
        groceries.setDalls("chana dal");
        groceries.setFruits("mango");
        groceries.setGeneral_items("tooth paste");

        groceries1.setVeggies("brinjal");
        groceries1.setDalls("chana dal");
        groceries1.setFruits("mango");
        groceries1.setGeneral_items("brush");

        list.add(groceries);
        list.add(groceries1);
        for (Groceries gro: list) {
            System.out.println(gro.getVeggies());
            System.out.println(gro.getDalls());
            System.out.println(gro.getFruits());
            System.out.println(gro.getGeneral_items());
            System.out.println("============================");
        }
        DuplicateExample duplicateExample = new DuplicateExample();
        duplicateExample.duplicate();


    }
}
