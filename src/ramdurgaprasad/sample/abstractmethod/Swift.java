package ramdurgaprasad.sample.abstractmethod;

public class Swift extends Car {
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    private int speed;
    private float mileage;

    @Override
    String color() {
        return "blue";
    }

    @Override
    double cost() {
        return 200000;
    }
}
