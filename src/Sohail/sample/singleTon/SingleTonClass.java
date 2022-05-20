package Sohail.sample.singleTon;

public class SingleTonClass {
    private static SingleTonClass singleton;
    private  SingleTonClass(){
        System.out.println("Hiii");
    }
    public static SingleTonClass y(){

           if (singleton==null){
            singleton=new SingleTonClass();
        }
        return singleton;
    }
}
