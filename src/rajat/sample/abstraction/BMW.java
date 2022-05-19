package rajat.sample.abstraction;

public class BMW extends Car{
   public void passValue(int price){
       if (price>1000000){
           System.out.println("Then showing BMW RR model");
       } else if (price>1500000) {
           System.out.println("then showing bmw top model of RR");
       }else {
           System.out.println("showing very costly BmW ");
       }

   }

    @Override
   public void carEngine() {
        System.out.println("Oil cooling engin ");
    }

    @Override
    public void seatDesign() {
        System.out.println("2 seat is there but it is very conformable");
    }
}
