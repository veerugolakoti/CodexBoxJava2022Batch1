package TejaAravind.Interfaces;

public class MainNested1 {
    public static void main(String[] args) {

    }
}
class Test{
    interface intros {
        void display();
    }
}
class Testing implements Test.intros{
    @Override
    public void display() {
        System.out.println("thanks");
    }
}
