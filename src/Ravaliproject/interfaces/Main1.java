package Ravaliproject.interfaces;

public class Main1 {
    public static void main(String[] args) throws CloneNotSupportedException{

        MarkerInterface  markerInterface = new MarkerInterface(8,"pooja");

        System.out.println(markerInterface.name);

        System.out.println(markerInterface.id);

        MarkerInterface markerInterface1= (MarkerInterface) markerInterface.myInterfacMethod();

        markerInterface1.name="ravali";

        System.out.println(markerInterface1.name + "actual data");

        System.out.println(markerInterface1.name);

        System.out.println(markerInterface1.id);
    }
}
