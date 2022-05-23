package Vamshi.sample.interfaces;

public class Ducati implements Bike {
    @Override
    public String EngineCC() {
        return "1000cc";
    }

    @Override
    public Integer RPM() {
        return 1200;
    }
}
