package Kalyan.checkedException;
public class ExampleofException {
   static void view(){
        System.out.println("print view point");
    }
   static void show(){
       int a=50,b=0;
       int c=a/b;
       System.out.println(""+c);
    }
    public static void main(String[] args) throws ArithmeticException{
       try{
           show();
           System.out.println("print value");
       } catch (ArithmeticException i){
           System.out.println("empty"+i.getMessage());
       }
       try{
           view();
       }finally {
        System.out.println("my final value");
       }
    }
}
