package rajat.sample.overriding;

public class SBI extends Bank{
    @Override
    public int getRateOfInterest() {
        return 8;
    }
}
