package Sohail.sample.exceptionhandling;

public class UncheckedException {
    public static void main(String[] args) {

        int a=10;
        int b= 20;
//        using try catch method for handling the Arithmetic Exception
//        if not used try and catch expression will get an ArithmeticException due to (/0)
        try {
            int sum = a / 0;
            int sum1 = b / 0;
            System.out.println(sum);
            System.out.println(sum1);
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong");
        }
    }

}

