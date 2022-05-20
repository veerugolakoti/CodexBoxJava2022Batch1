package Nagarjuna.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        MySingleton ms1=MySingleton.getInstance();
        MySingleton ms2=MySingleton.getInstance();
        System.out.println(ms1.s);
        System.out.println(ms2.s);

    }
}
