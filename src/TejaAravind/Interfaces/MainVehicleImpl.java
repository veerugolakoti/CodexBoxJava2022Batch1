package TejaAravind.Interfaces;

interface VehicleInterface{
    int gearChange(int newgear);
    int speedUp(int inc);
    int applyBrakes(int inc);
}

public class MainVehicleImpl {
    public static void main(String[] args) {

        Bike bike = new Bike(30,3);
        bike.display();
        Car car = new Car(40,2);
        car.display();

    }
}
class Bike implements VehicleInterface{
    int speed;
    int gear;

    public Bike(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public int applyBrakes(int dec) {
        return speed - dec;
    }


    public int speedUp(int inc) {
        return speed + inc;
    }


    public int gearChange(int newgear) {
        return gear + newgear;
    }


    public void display() {
        System.out.println("Iam in Bike");
        System.out.println(speedUp(20));
        System.out.println(gearChange(1));
        System.out.println(applyBrakes(10));
    }
}
class Car implements VehicleInterface{
    int speed;
    int gear;

    public Car(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public int applyBrakes(int dec) {
        return speed - dec;
    }


    public int speedUp(int inc) {
        return speed + inc;
    }


    public int gearChange(int newgear) {
        return gear + newgear;
    }


    public void display() {
        System.out.println("Iam in car");
        System.out.println(speedUp(50));
        System.out.println(gearChange(2));
        System.out.println(applyBrakes(20));
    }
}
