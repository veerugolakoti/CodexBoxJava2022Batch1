package rajat.sample.interfaces;

public class ImplClass implements MyInterface{
    int a=10;
    int b=30;
    public void getName(){
        System.out.println(COMPANY_NAME);
    }

    @Override
    public void operation() {
        int result = a+b;
        System.out.println("The result is::"+result);

    }
}
