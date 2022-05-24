package Shiva.FinalKeyword;

public class Main {
    public static void main(String[] args) {
        FinalClassEx fn = new FinalClassEx();
        fn.run();
        FinalVariables fv = new FinalVariables();
        System.out.println(fv.getNum1());
        System.out.println(fv.getNum2());
        FinalMethod fm = new FinalMethod();
        fm.finalMethod();
    }
}
