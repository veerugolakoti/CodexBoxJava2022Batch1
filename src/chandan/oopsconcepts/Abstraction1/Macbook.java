package chandan.oopsconcepts.Abstraction1;

public class Macbook extends Laptop{
    @Override
    float cost() {
        return 0;
    }

    @Override
    String name() {
        return null;
    }

    @Override
    String ramSize() {
        return null;
    }
    private float cost;
    private String name;
    private String ramSize;

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }
}



