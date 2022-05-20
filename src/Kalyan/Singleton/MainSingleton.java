package Kalyan.Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }
}