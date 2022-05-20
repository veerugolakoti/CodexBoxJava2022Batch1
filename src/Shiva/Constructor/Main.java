package Shiva.Constructor;

public class Main {
    public static void main(String[] args) {
        ConstructorEx con = new ConstructorEx(4,"Blue", 400000.99);
        con.carDetails();
        ConstructorEx con2 = new ConstructorEx(2, "White", 60000.99);
        con2.carDetails();
    }
}
