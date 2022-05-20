package Dhivya.sample.abstraction;

public class Model2 extends SamsungModels{
    @Override
    int price() {
        return 0;
    }

    @Override
    String memory() {
        return null;
    }

    @Override
    int size() {
        return 0;
    }
    private int price;
    private String memory;
    private int size;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
