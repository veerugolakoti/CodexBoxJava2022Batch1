package rehana.sample.exceptionhandling;

public class NullpointerException {
    /*public static void main(String[] args) {*/
    String Execption(){
        try {
            String s = null;
            System.out.println(s.length());

        } catch (NullPointerException e) {
            System.out.println("nullpointerexception");
        }
        return null;
    }
}