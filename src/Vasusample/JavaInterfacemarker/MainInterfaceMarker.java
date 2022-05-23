package Vasusample.JavaInterfacemarker;

public class MainInterfaceMarker {
    public static void main(String[] args) throws CloneNotSupportedException {
        Interfacemarker I = new Interfacemarker("vaasu",1234);
        System.out.println(I.name);
        System.out.println(I.id);
        I.name = "ravi";
        I.id = 5456;
        System.out.println(I.name);
        System.out.println(I.id);
    }
}
