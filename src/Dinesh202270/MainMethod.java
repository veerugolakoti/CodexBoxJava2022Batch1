package Dinesh202270;

public class MainMethod {
    public static void main(String[] args) {

       NewClass newClass= new NewClass();

        newClass.Method1();
newClass.method2();
newClass.method3();
newClass.method4();
newClass.method5();

Abstraction abstraction=new NewClass();
        System.out.println(abstraction.method2());

        OldClass s=new OldClass() {
            @Override
            public void Method1() {
                super.Method1();
            }
        };


    }
}
