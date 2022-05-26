package smrutiranjan.practice.excedemo.trycatchex;

public class NestedTryCatch {

        void nestedTryCatch () {
        try {
            try {
                int i = 30 / 0;
                System.out.println("arithmatic exception:" + i);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int i[] = new int[5];
                i[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("others exception");
        } catch (Exception e) {
            System.out.println("handle exception");
        }
        System.out.println("normal flow");
    }
    }
