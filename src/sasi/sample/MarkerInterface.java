package sasi.sample;
public class MarkerInterface implements Cloneable {
    public int id;

    public void display() {
        System.out.println("i am inside the tag");
    }

    public  Object getMarkerInterface()
            throws CloneNotSupportedException {

        return clone();
    }
}
