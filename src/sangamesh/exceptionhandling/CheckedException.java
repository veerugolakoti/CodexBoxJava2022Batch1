package sangamesh.exceptionhandling;

public class CheckedException {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
