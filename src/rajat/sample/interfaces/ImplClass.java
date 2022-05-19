package rajat.sample.interfaces;

import rajat.sample.abstraction.Car;
import rajat.sample.abstraction.MahindraCar;

public class ImplClass implements MyInterface{
    int a=10;
    int b=30;
    public void getName(){
        System.out.println(COMPANY_NAME);
    }
 public Car getcar(){
        Car car = new MahindraCar("green", 560);
        return car;
 }
    @Override
    public void operation() {
        int result = a+b;
        System.out.println("The result is::"+result);

    }
}
