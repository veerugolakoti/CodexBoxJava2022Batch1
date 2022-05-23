package TejaAravind.Interfaces;

interface  JavaExample{
//    static void display(){
//        System.out.println("Iam in java example");
//    }
    default void display(){
        System.out.println("Iam in java example");
    }
}

class Demo implements  JavaExample{

    int a = 45;
    @Override
    public void display(){
        System.out.println("Iam in demo class example and A :"+ a);
    }
}

public class MainJavaExample {
    public static void main(String[] args) {
        Demo demo = new Demo();
//        JavaExample.display();
        demo.display();

//        JavaExample jE = new JavaExample() {
//            @Override
//            public void display() {
//                JavaExample.super.display();
//            }
//        };
    }
}
