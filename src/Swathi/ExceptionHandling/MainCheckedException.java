package Swathi.ExceptionHandling;

public class MainCheckedException {
    public static void main(String[] args) {
        Student OBJECT = new Student();
        OBJECT.method();
        System.out.println(OBJECT.name);
    }
}