package JavaTraining.abstractmethod.inheritance;

public class Dell extends Laptop {
    int batterycapacity;
    String buildmaterial;

    @Override
    public double getProcessor() {
        return processor;
    }

    @Override
    public void setProcessor(double processor) {
        this.processor = processor;
    }

    double processor;

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    int weight;


    public int getBatterycapacity() {
        return batterycapacity;
    }

    public void setBatterycapacity(int batterycapacity) {
        this.batterycapacity = batterycapacity;
    }

    public String getBuildmaterial() {
        return buildmaterial;
    }

    public void setBuildmaterial(String buildmaterial) {
        this.buildmaterial = buildmaterial;
    }
}
