package Abhilash.exceptionhandling;

public class CustomExceptionImpl {
    public static void main(String[] args) {
        CustomExceptionExample customExceptionExample = new CustomExceptionExample();
        try {
            String a = null;
        }
        catch(Exception e){
            System.out.println(customExceptionExample.getMessage());
        }

    }
}
