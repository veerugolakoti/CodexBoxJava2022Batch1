package rajat.sample.abstraction;

public class RollsRoyce extends Car{
    private int price;
    private int maxSpeed;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void carEngine() {
        System.out.println("Diesel Engin");
    }


    @Override
    public void seatDesign() {
        System.out.println("6 capacity");


    }
}
