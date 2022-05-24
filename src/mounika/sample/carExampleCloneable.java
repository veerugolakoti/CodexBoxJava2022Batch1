package mounika.sample;

import com.sun.org.apache.xpath.internal.objects.XObject;

public class carExampleCloneable implements Cloneable {
    public String carname;

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    String colour;

    public Object clone() throws CloneNotSupportedException {
        return carname;


    }


    }
