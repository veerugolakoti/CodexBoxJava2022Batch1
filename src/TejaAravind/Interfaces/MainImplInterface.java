package TejaAravind.Interfaces;

interface InterfaceExample {
        int a = 10;
        void displayData();


}

class InterfaceImpl implements InterfaceExample {
    @Override
    public void displayData() {
        System.out.println("a : " + a);

    }
}
public class MainImplInterface{
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();
        impl.displayData();
        System.out.println(InterfaceExample.a);
        System.out.println(InterfaceImpl.a);
    }
}

