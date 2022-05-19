package rajat.sample.overriding;

public class ParentClass {
    int a=10;
    int b=20;
    public void add(){
        int c=a+b;
        System.out.println("the value of parent class::"+c);
    }
    public void div(){
        System.out.println("The Parent class division method::"+(a/b));
    }
}
