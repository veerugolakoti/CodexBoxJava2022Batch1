package Kalyan.MarkerInterface;

import java.util.Scanner;

public  class Car implements Cloneable {
    String CareName;
    String CareColor;
    Double CarePrice;
    public Car(String Name, String Color, Double Price) {
        this.CareName = Name;
        this.CareColor = Color;
        this.CarePrice = Price;
    }
    public void getdetails() {
        System.out.println("CarName:" + CareName);
        System.out.println("CarColor:" + CareColor);
        System.out.println("CarPrice:" + CarePrice);
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CarName: ");
        String Name = sc.next();
        System.out.print("Enter CarColor: ");
        String Color = sc.next();
        System.out.print("Enter CarPrice: ");
        double Price = sc.nextDouble();
        System.out.println("-------Car Detail--------");
        Car c1 = new Car(Name, Color, Price);
        Car c2 = (Car) c1.clone();
        c2.getdetails();
    }
}
