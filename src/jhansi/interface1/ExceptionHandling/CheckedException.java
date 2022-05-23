package jhansi.interface1.ExceptionHandling;

public class CheckedException {
    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


    }

    int method1(){
        System.out.println("my name is jhansi");
        return 2;
    }
}
