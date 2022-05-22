package smrutiranjan.practice.excedemo;

public class ExceptionProg1 extends Throwable {
    private static int accno[];
    private static String name[] ;
    private static long bal[];

    public static long[] getBal() {
        return bal;
    }

    public static void setBal(long[] bal) {
        ExceptionProg1.bal = bal;
    }

    public static int[] getAccno() {
        return accno;
    } public ExceptionProg1(){

    }

    public static void setAccno(int[] accno) {
        ExceptionProg1.accno = accno;
    }

    public static String[] getName() {
        return name;
    }

    public static void setName(String[] name) {
        ExceptionProg1.name = name;
    }
}
