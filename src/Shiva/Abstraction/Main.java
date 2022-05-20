package Shiva.Abstraction;

public class Main {
    public static void main(String[] args) {
        Fruits f1 = new Apple();
        Fruits f2 = new Banana();
        Fruits f3 = new Grapes();
        System.out.println(f1.nutrition());
        System.out.println(f2.nutrition());
        System.out.println(f3.nutrition());
    }
}
