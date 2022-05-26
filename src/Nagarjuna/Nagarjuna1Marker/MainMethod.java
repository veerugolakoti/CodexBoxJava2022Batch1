package Nagarjuna.Nagarjuna1Marker;

public class MainMethod {
    public static void main(String[] args) {
        MarkerInterface mi=new MarkerInterface();
        mi.num=12;
        System.out.println("actual value "+mi.num);
        MarkerInterface mi1=new MarkerInterface();
        mi1.num=13;
        System.out.println("other value "+mi1.num);
    }
}
