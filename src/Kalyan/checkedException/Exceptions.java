package Kalyan.checkedException;

public class Exceptions{
    public static void display() throws IllegalArgumentException{
        System.out.println("trying statement cannot be display ");
        throw new IllegalArgumentException();
    }
    public static void main(String[] args) {
        try {
            display();
            System.out.println("this is my try block");
        }catch (IllegalArgumentException e){
            System.out.println("catching statrment display");
        }
        finally {
            System.out.println("my final statement is completed");
        }
    }
}
