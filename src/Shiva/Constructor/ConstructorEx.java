package Shiva.Constructor;

import java.util.Collections;

public class ConstructorEx {
    int wheels;
    String color;
    double cost;
    public ConstructorEx(int wheels, String color, double cost) {
        this.wheels = wheels;
        this.color = color;
        this.cost = cost;
    }
    public void carDetails() {
        System.out.println("Wheels: " + wheels + "\n" + "Color: " + color + "\n" + "Cost: " + cost);
    }
}
