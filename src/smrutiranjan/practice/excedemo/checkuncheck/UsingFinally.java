package smrutiranjan.practice.excedemo.checkuncheck;

public class UsingFinally {
    void finallyException() {
     //provide int[] i to access the finally clause
        int[] i = new int[0];
        try {
            i = new int[3];
            i[4] = 7;
            System.out.println(i[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("finally in try catch :" + e);

    //using finally
        } finally {
            i[0]=8;
            System.out.println("finally used to print the value :"+i[0]);
        }

    }
}
