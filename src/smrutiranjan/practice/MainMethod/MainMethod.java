package smrutiranjan.practice.MainMethod;

import smrutiranjan.practice.collection.ListProgram;
import smrutiranjan.practice.excedemo.checkuncheck.CheckedException;
import smrutiranjan.practice.excedemo.checkuncheck.UsingFinally;
import smrutiranjan.practice.excedemo.exceptionhandling.ExceptionHandling;
import smrutiranjan.practice.excedemo.exceptionhandling.ExceptionProg1;
import smrutiranjan.practice.excedemo.exceptionhandling.ExeptionPract;
import smrutiranjan.practice.excedemo.trycatchex.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args)
    // throws IOException
    {
//checkuncheck package
      /*  System.out.println("----checked exception----");
        CheckedException ce = new CheckedException();
        ce.checkExce();
        System.out.println("\n");
*/
        //i created my own run time exception using throw after handling the exception

      /*  System.out.println("----unchecked exception----");
        UnCheckedException unce = new UnCheckedException();
        unce.uncheckedExce();*/

      /*  System.out.println("----finally in try catch----");
        UsingFinally uf = new UsingFinally();
        uf.finallyException();
        System.out.println("\n");*/

//exception handling package
      /*  try{
            ExceptionProg1 ep = new ExceptionProg1();

            System.out.println("ExceptionProg1 program output :" + "acc no:"+"\t"+"cust name:"+"\t");
            ep.setAccno(new int[]{11, 12, 13, 14});
            ep.setName(new String[]{"risi", "satya", "rabi", "laxmi", "subha"});
            ep.setBal(new long[]{1002,2001,3999,4580,2541,5900,7850});
            for(int i=0; i<7; i++){
                //  System.out.println("ExceptionProg1 program output :" +ep.getAccno()+"\t"+ep.getName()+"\t"+ep.getBal());

                if(ep.getBal()[i]<3000){
                    System.out.println("bal is low ");
                    throw ep;
                }
            }
        }catch(ExceptionProg1 e) {
            e.printStackTrace();
             System.out.println("\n");
        }*/


        //ExceptionHandling program ;
      /*  ExceptionHandling eh2 = new ExceptionHandling(2,"smr");

        eh2.getS();
        System.out.println( eh2.getI());
        System.out.println( eh2.getS());

        if (eh2 != null)
        {
            eh2.setI(4);
            eh2.setS("ran");
        }

        //ExceptionPract program
        ExeptionPract me = new ExeptionPract("Balance is less than 1000");

        System.out.println("output of ExeptionPract :" + "ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

        me.exception();


        for (int i = 0; i < 5; i++) {

            System.out.println("ExceptionPract Prrogram output :" + me.getAccno() + "\t" + me.getBal() +
                    "\t" + me.getName());
            System.out.println("\n");
        }
*/
//trycatchex package programms
       /* ExceptionDemo ed = new ExceptionDemo();
        ed.exceptionDemo();

        NestedTryCatch ntc = new NestedTryCatch();
        ntc.nestedTryCatch();*/

      /*  ThrowEx te = new ThrowEx();
        te.throwEx();
*/
      /*  Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        ThrowScanner ts= new ThrowScanner();
        ts.checkAge(18);
        System.out.println(ts);

        TryCatchD2 tcd2 = new TryCatchD2();
        tcd2.tryCatchd2();

        TryCatchD3 tcd3 = new TryCatchD3();
        tcd3.tryCatchd3();
        System.out.println("\n");*/

//collection package
        ListProgram lp = new ListProgram();
        lp.listProgram();

    }
}
