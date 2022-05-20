package renuprojects.MarkerInterface;

public class MarkerInterfaceExample implements Cloneable{
    int id;
    String name;
    String address;
    public MarkerInterfaceExample(int id, String name, String address) {
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public Object getMarkerInterface() throws CloneNotSupportedException {
        return clone();
    }
}
