package rajat.sample.staticblock;

public class StaticBlockClass {
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main Block");
    }
    static {
        System.out.println("====2nd Static Block====");
    }
}
