package renuprojects.MarkerInterface;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MarkerInterfaceExample marker1 = new MarkerInterfaceExample(111, "Renu", "Hyd");
        System.out.println(marker1.id);
        MarkerInterfaceExample marker2 = (MarkerInterfaceExample) marker1.getMarkerInterface();
        System.out.println(marker2.id);
        System.out.println(marker2.name);
        System.out.println(marker2.address);
    }
}
