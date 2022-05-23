package Nagarjuna.Clone;

public class MainMethod {
    public static void main(String[] args) {
        MyInterface myInterface=new MyInterface(1,"nag","cse");
         MyInterface1 myInterface1=new MyInterface1("kvsr");
        System.out.println(myInterface1.getClgName());
        System.out.println(myInterface.getName());
        System.out.println(myInterface.getRollno());
        System.out.println(myInterface.getCourseName());
    }
}
