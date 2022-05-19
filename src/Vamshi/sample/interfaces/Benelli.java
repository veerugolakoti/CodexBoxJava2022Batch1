package Vamshi.sample.interfaces;

public class Benelli implements Bike {


    @Override
    public String EngineCC() {
        return "600i";
    }

    @Override
    public Integer RPM() {
        return 1000;
    }
}
