package TejaAravind.basics.singleton;

public class Singleton {
    private static Singleton st;


    private Singleton (){
        System.out.println("Iam inside singleton");
    }
    public static Singleton getInstance(){
        if (st == null){
            st = new Singleton();

        }
        return st;
    }



}
