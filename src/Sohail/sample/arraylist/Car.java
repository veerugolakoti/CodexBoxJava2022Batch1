package Sohail.sample.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String carName;
    private String carPrice;
    private int carModel;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarModel() {
        return carModel;
    }

    public void setCarModel(int carModel) {
        this.carModel = carModel;

    }
    public void m4(){
        Car car2 =new Car();
        car2.setCarName("Ford");
        car2.setCarPrice("10L");
        car2.setCarModel(2022);
        Car car1 = new Car();
        car1.setCarName("Nano");
        car1.setCarPrice("5L");

        List<Car> list = new ArrayList();
        list.add(car2);
        list.add(car1);

        for (Car car: list) {
            System.out.println("Car Name : "+ car.getCarName());
            System.out.println("Car Price : " + car.getCarPrice());
            System.out.println("=================================");

        }
    }

}




