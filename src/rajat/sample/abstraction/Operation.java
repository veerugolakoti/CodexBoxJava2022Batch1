package rajat.sample.abstraction;

public abstract class Operation {
    String name;
    int a=10;
    int b=20;

    abstract void addition();
    abstract void multiplication();
    public void allOperation(){
        System.out.println("It is a abstract class");
        if (a > b){
            System.out.println("the value of a is greater");
        }else {
            System.out.println("The value of b is greater");
        }

    }
}
