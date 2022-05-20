package Shiva.JavaAssessement;

public class SwapVar {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        char ch1 = 'a';
        char ch2 = 'b';
        float f1 = 12.34f;
        float f2 = 15.34f;
        double d1 = 12.23;
        double d2 = 28.15;
        byte b1 = 12;
        byte b2 = 17;
        short s1 = 2;
        short s2 = 8;
        long l1 = 12l;
        long l2 = 17l;
        boolean bb1 = true;
        boolean bb2 = false;
        System.out.println("swapping Integer data type");
        System.out.println("Before swapping");
        System.out.println("a = " +  a);
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();


        System.out.println("Swapping double data type");
        System.out.println("Before swapping");
        System.out.println("d1 = " +  d1);
        System.out.println("d2 = " + d2);
        double temp1 = d1;
        d1 = d2;
        d2 = temp;
        System.out.println("After swapping");
        System.out.println("d1 = " +  d1);
        System.out.println("d2 = " + d2);

    }
}
