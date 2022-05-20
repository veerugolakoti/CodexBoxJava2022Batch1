package Shiva.Interfaces;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Bicycle();
        v1.speed();
        v2.speed();
        v3.speed();
    }
}
