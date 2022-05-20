package Nagarjuna1.Interface;

public class Imple  implements Interface1,Interface2{

    @Override
    public void f1() {
        System.out.println("calling f1");
    }

    @Override
    public void f2() {
        System.out.println("calling f2");

    }

    @Override
    public void f3() {
        System.out.println("calling f3");
    }
}
