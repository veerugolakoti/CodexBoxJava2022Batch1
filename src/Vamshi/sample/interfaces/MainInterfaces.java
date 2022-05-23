package Vamshi.sample.interfaces;

public class MainInterfaces {
    public static void main(String[] args) {
        Bike bike1 = new Benelli();
        System.out.println(bike1.EngineCC());
        System.out.println(bike1.RPM());
        Bike bike2 = new Ducati();
        System.out.println(bike2.EngineCC());
        System.out.println(bike2.RPM());




    }
}
