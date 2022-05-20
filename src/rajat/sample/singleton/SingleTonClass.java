package rajat.sample.singleton;

public class SingleTonClass {

  private static SingleTonClass singleTonClass;
    private SingleTonClass(){
        System.out.println("Welcome to Rajat heart");
    }
    public static SingleTonClass getSingleTonClass(){

        if (singleTonClass==null){
            singleTonClass = new SingleTonClass();
        }
        return singleTonClass;
    }
}
