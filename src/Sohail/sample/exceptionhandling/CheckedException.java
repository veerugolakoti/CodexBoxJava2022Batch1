package Sohail.sample.exceptionhandling;

public class CheckedException implements Cloneable {
    //checked exception comes during the compile time and should be handled
    private String name;
    private long number;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }




    public CheckedException getCheckException() {







        try {
           return (CheckedException) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("something went wrong");
        }
        return null;
    }

    public void m1(){
        CheckedException checkedException = new CheckedException();
        checkedException.setName("No cloning  ");
        checkedException.setNumber(8867374717l);
        System.out.println(checkedException.getName());
        System.out.println(checkedException.getNumber());
        CheckedException checkedException1=checkedException.getCheckException();
        checkedException1.setName("Cloning Completed");
        checkedException1.setNumber(123456789l);
        System.out.println(checkedException1.getName());
        System.out.println(checkedException1.getNumber());
    }
    }



