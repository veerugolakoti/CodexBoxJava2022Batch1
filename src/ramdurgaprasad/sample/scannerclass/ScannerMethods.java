package JavaTraining.scannerclass;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        System.out.println("the int value is:"+ i);
       short s= scanner.nextShort();
        System.out.println("the short value:"+ s);
        byte b=scanner.nextByte();
        System.out.println("the byte value is:"+b );
        long l=scanner.nextLong();
        System.out.println("the long value provide is :"+l);
        float f=scanner.nextFloat();
        System.out.println("the float value given is:"+f);
        double d= scanner.nextDouble();
        System.out.println("the double value is:"+d);
        String str=scanner.next();
        System.out.println("the string is:"+str);

    }
}
