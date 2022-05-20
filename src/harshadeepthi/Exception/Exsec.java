package harshadeepthi.Exception;

public class Exsec {
    public static void main(String args[]) {
            try {
                int Data = 20 / 0;
                System.out.println("devide");
            } catch (ArithmeticException exception) {
                System.out.println(exception);
            }
            try {
                int i[] = new int[5];
                i[5] = 4;
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println(exception);
            } catch (Exception exception) {
                System.out.println("Exception exception");
            }
    }
}
