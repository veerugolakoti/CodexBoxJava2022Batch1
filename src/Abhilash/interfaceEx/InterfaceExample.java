package Abhilash.interfaceEx;

public class InterfaceExample implements Cloneable{
    String s = "ABHILASH";
    void display() {
        System.out.println("i am working on tagged interfaces");
    }
    public Object getInterfaceExample() throws CloneNotSupportedException {

        return clone();
    }
}
