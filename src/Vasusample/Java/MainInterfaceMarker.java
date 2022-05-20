package Vasusample.Java;

public class MainInterfaceMarker {
    public static void main(String[] args) throws CloneNotSupportedException {
        Interfacemarker I = new Interfacemarker("vaasu",1234);
        System.out.println(I.name);
        System.out.println(I.id);
        I.n = "AAA";
        I.i = 545;
        System.out.println(I.i);
        System.out.println(I.n);
    }
}
