package Swathi.ExceptionHandling;

public class Student implements Cloneable {
    String name="swathi";

    Student method() {
            System.out.println("running");

            try {
                return (Student) clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("the exception occures when we remove the cloneable");
            }
            return null;
        }}
