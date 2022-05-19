package rajat.sample.practice;

public class FibonacceApplication {
    public static void main(String[] args) {
        int a=0,b=0,c=1,num=10;
        System.out.println("fibonacci series are::");
        for(int i=1;i<=20;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a +" ");
        }
    }
}
