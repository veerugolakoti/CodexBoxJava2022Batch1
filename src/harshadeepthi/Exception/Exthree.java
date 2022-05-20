package harshadeepthi.Exception;

public class Exthree {
    public static void main(String[] args){
        try{
        int data=55/5;
        System.out.println("data");
    }
        catch(NullPointerException exception){
            System.out.println(exception);
        }
        finally {
            System.out.println("final block executed");

        }
        System.out.println("code");
        }

}
