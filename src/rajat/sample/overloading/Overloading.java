package rajat.sample.overloading;

public class Overloading {
    public void operation(int a){
        System.out.println("The value of a::"+a);
    }
    public int operation(int a, int b){
        return a+b;
    }
    public float operation (int a, float b){
        return a*b;
    }
    public double operation( double a,double b){
        return (a/b);
    }
}
