package jhansi.interface1.ExceptionHandling;

public class MainMethod {
    public static void main(String[] args){
        Employee OBJECT = new Employee();
        try{
        OBJECT.method1();
    }
        catch (Exception e){
            System.out.println("file not found");
        }
}}