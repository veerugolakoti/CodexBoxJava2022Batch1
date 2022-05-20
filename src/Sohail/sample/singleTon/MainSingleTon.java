package Sohail.sample.singleTon;

public class MainSingleTon {
    public static void main(String[] args) {
        SingleTonClass x =  SingleTonClass.y();
        SingleTonClass X1= SingleTonClass.y();
        SingleTonClass x2=SingleTonClass.y();
        System.out.println(x);
        System.out.println(X1);
        System.out.println(x2);
    }
}
