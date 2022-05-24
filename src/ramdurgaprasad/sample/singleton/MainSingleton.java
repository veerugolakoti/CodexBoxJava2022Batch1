package ramdurgaprasad.sample.singleton;

public class MainSingleton {
    public static void main(String[] args) {
Singletonexample singletonexample=Singletonexample.getJavasingleton();
        Singletonexample singletonexample1=Singletonexample.getJavasingleton();
        Singletonexample singletonexample2=Singletonexample.getJavasingleton();
        System.out.println(singletonexample.hashCode());
        System.out.println(singletonexample1.hashCode());
        System.out.println(singletonexample2.hashCode());

    }
}




