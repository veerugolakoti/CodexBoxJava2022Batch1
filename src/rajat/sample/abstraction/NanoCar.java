package rajat.sample.abstraction;

public class NanoCar extends Car{


    @Override
    public void carEngine() {
        System.out.println("Petrol Engin");

    }

    @Override
    public void seatDesign() {
        System.out.println("4 seater but not comfortable");

    }
}
