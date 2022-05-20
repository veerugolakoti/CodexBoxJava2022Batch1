package Ravaliproject.interfaces;

public class MarkerInterface  implements Cloneable {
     int id;
     String name;

    public MarkerInterface(int id, String name) {
        this.id= id;
        this.name=name;

    }


    public Object myInterfacMethod() throws CloneNotSupportedException {
        return clone();
    }
}
