package Nagarjuna.Interface;

public class HelloInterface {
    public static void main(String[] args) {
//        Interface1 i1=new Interface1();
//            Interface2 i2=new Interface2();
        Interface1 im = new Imple();
        im.f1();
        Interface2 im1 = new Imple();
        im1.f2();
        im1.f3();
    }
}
