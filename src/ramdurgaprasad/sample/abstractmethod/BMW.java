package JavaTraining.abstractmethod;

public class BMW extends Car {
    int speed;
    float mileage;
    BMW (int sp, float mil){
        speed = sp;
        mileage = mil;

    }

    @Override
    String color() {
        return "white";
    }

    @Override
    double cost() {
        return 1000000;
    }
}
