package rajat.sample.singleton;

public class SingletonExample {
    private static SingletonExample singleTonClass = null;
    private SingletonExample(){
        System.out.println("Welcome to Rajat heart");
    }
    public static SingletonExample getSingleTonClass(){
        if (singleTonClass==null){
            singleTonClass = new SingletonExample();
        }
        return singleTonClass;
    }
}
