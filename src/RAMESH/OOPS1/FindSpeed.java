package RAMESH.OOPS1;

public class FindSpeed {
    public static void main(String[] args) {
        Bike b = new Bike(40,4);
        System.out.println("bike speed :"+  b.speed()+ " km/hr");
        ACar c = new ACar();
        c.setDistance(50);
        c.setTime(5);
        System.out.println("car speed :"+c.speed() + "  km/hr");
    }
}
