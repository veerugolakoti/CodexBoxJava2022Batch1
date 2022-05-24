package chandan.oopsconcepts.Abstraction1;

public class MainLaptop {
    public static void getmainLaptop() {
Macbook macbook = new Macbook();
macbook.setCost(250000);
macbook.setName("Apple Macebook Air");
macbook.setRamSize("16 GB");
        System.out.println("cost of apple macbook " + macbook.getCost());
        System.out.println("name of macbook is " + macbook.getName());
        System.out.println("size of ram is " + macbook.getRamSize());
        Alienware alienware = new Alienware();
        alienware.setCost(200000);
        alienware.setName("Alienware i7");
        alienware.setRamSize("8 GB");
        System.out.println("cost of Alienware " + alienware.getCost());
        System.out.println("name of Alienware is " +alienware.getName());
        System.out.println("size of ram is " +alienware.getRamSize());

    }
}
