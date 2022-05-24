package smrutiranjan.practice.excedemo.checkuncheck;

import java.io.FileNotFoundException;
import java.io.UncheckedIOException;

public class MainClass {
    public static void main(String[] args) throws Exception {
        System.out.println("----checked exception----");
       CheckedException ce = new CheckedException();
            ce.checkExce();

   //i created my own run time exception using throw after handling the exception

      /*  System.out.println("----unchecked exception----");
        UnCheckedException unce = new UnCheckedException();
        unce.uncheckedExce();*/

        System.out.println("----finally in try catch----");
        UsingFinally uf = new UsingFinally();
        uf.finallyException();

    }
}
