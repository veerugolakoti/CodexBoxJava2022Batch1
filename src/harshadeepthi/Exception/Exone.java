package harshadeepthi.Exception;

public class Exone {
    public static void main(String[] args){
        try{
            int a=20/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);

        }
        System.out.println("Data");
    }
}
