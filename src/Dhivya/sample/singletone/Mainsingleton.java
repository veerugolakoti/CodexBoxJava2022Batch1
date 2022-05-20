package Dhivya.sample.singletone;
public class Mainsingleton {
    public static void main(String[] args) {
        SingletoneExample singletoneExample1=SingletoneExample.getInstance();
        SingletoneExample singletoneExample2=SingletoneExample.getInstance();
        System.out.println(singletoneExample1.hashCode());
        System.out.println(singletoneExample2.hashCode());
    }
}
