package Veeru.sample.inheritance;

import java.awt.image.SampleModel;

abstract public class Mobile  {


    private String model;
    private Double price;
    private Integer batteryCapacity;
    private String storage;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

 abstract  public void setPixelSize(float pixel);

 abstract public float getPixelSize();

 public final void display() {
     System.out.println("Hello welcome to Mobile ");
 }
}
