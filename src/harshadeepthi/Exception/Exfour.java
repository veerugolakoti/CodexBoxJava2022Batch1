package harshadeepthi.Exception;

public class Exfour {
    public static void main(String[] Args) {
        try {
            int[] myNumber = {1, 2, 3, 4};
            System.out.println(myNumber[10]);
        } catch (Exception e) {
            System.out.println("harsha");
        } finally {
            System.out.println("deepthi");
        }
    }
}