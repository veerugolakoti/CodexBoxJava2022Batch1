package smrutiranjan.practice.excedemo.exceptionhandling;

public class ExeptionPract extends Throwable {
    private static int[] accno = {1001, 2045, 3403, 1704};

    private static String[] name = {"Nish", "Shubh", "Sakhsi", "Bobi", "Akash"};

    private static double[] bal = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};

    public static int[] getAccno() {
        return accno;
    }

    public static void setAccno(int[] accno) {
        ExeptionPract.accno = accno;
    }

    public static String[] getName() {
        return name;
    }

    public static void setName(String[] name) {
        ExeptionPract.name = name;
    }

    public static double[] getBal() {
        return bal;
    }

    public static void setBal(double[] bal) {
        ExeptionPract.bal = bal;
    }




        ExeptionPract(String s) {

        }
        void exception(){

        }
    }


