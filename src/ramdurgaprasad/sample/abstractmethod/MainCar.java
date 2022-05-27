package JavaTraining.abstractmethod;

public class MainCar {
    public static void main(String[] args) {
        BMW model = new BMW(200, 10);
        System.out.println(model.mileage);
        System.out.println(model.speed);
        model.sum();
        System.out.println(model.cost());
        System.out.println(model.color());

        Swift s = new Swift();
        s.setSpeed(100);
        s.setMileage(25);
        System.out.println(s.getSpeed());
        System.out.println(s.getMileage());
        System.out.println(s.cost());
        System.out.println(s.color());

    }
}
