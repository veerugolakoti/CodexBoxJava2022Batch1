package TejaAravind.basics.singleton;



public class mainSingleton {
    public static void main(String[] args) {
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        Singleton st3 = Singleton.getInstance();
        Singleton st4 = Singleton.getInstance();
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());

    }
}
