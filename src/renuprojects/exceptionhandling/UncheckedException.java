package renuprojects.exceptionhandling;

public class UncheckedException {
    int a=5;
    int b=0;
    int div=a/b;
    public void div(){
        System.out.println("division is:"+ div);
    }

    public static void main(String[] args) {
        UncheckedException uncheckedException=new UncheckedException();

        uncheckedException.div();
    }


}
