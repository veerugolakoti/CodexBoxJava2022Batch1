package Sivannarayana.Assessment.singleton;

public class main {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        System.out.println("Hascode of x is"+ x.hashCode());
        System.out.println("Hascode of y is"+ y.hashCode());
        System.out.println("Hashcode of z is"+ z.hashCode());
    }
}
