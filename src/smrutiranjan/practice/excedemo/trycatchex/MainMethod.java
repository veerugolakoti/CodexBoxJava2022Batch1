package smrutiranjan.practice.excedemo.trycatchex;

import java.io.IOException;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) throws IOException {
        ExceptionDemo ed = new ExceptionDemo();
        ed.exceptionDemo();

        NestedTryCatch ntc = new NestedTryCatch();
        ntc.nestedTryCatch();

        ThrowEx te = new ThrowEx();
        te.throwEx();

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        ThrowScanner ts= new ThrowScanner();
        ts.checkAge(18);
        System.out.println(ts);

        TryCatchD2 tcd2 = new TryCatchD2();
        tcd2.tryCatchd2();

        TryCatchD3 tcd3 = new TryCatchD3();
        tcd3.tryCatchd3();
    }
}
