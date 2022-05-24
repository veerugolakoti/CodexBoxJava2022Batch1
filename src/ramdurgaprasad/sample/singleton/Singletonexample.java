package ramdurgaprasad.sample.singleton;

public class Singletonexample {
    private static Singletonexample javasingleton;String teja;

    Singletonexample(){
        System.out.println("javasingleton is a concept related to constructor");

    }

    public static Singletonexample getJavasingleton() {
        if(javasingleton==null){
            javasingleton=new Singletonexample();

        }
        return javasingleton;
    }
}
