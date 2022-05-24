package jhansi.main;

import jhansi.ExceptionHandlingExamples.CheckedExample;

public class MainApplication {
    public static void main(String[] args) {
       /* Employee OBJECT = new Employee();
        System.out.println("file not found");*/
       // System.out.println("================exceptionhandling");


       /* InterfaceEx imp = new InterfaceEx();
        imp.display();*/
        //System.out.println("=================interface example");

/*

        MarkerExample marker=new MarkerExample("jhansi",8);

        System.out.println(marker.name);
        System.out.println(marker.id);

*/
        //System.out.println("==============marker interface");


        CheckedExample ckm = new CheckedExample();
        ckm.method();

    }
}
