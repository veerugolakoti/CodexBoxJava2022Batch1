package rajat.sample.strings;

public class MethodApp {
    public int addition(int a, int b) {
        return a + b;

    }

    public static void multiplication(int i, int j, int k) {
        int mul = i * j * k;
        System.out.println(mul);
    }

    public static void main(String[] args) {
        MethodApp methodApp = new MethodApp();
        System.out.println(methodApp.addition(12, 23));
        multiplication(6, 8, 9);
//        System.out.println(mul);
//        System.out.println(multiplication(4,7,9));
//    }
    }
}