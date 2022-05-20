package Nagarjuna.singleton;

public class MySingleton {
    private static MySingleton ms = null;
    String s;

    private MySingleton() {
        s = "naga1";
    }

    public static MySingleton getInstance() {
        if (ms == null) {
            ms = new MySingleton();
        }
        return ms;

    }
}
