package JavaTraining.abstractmethod.inheritance;

public class MianLaptop {
    public static void main(String[] args) {
        Laptop lap=new Laptop();
        lap.model="rtr4127";
        lap.setWeight(78);
        System.out.println("the weight of the laptop:"+lap.getWeight());
        Dell de=new Dell();
        de.setWeight(3);
        System.out.println("the weight of the Dell laptop:"+ de.getWeight());
        de.setProcessor(12.21);
        System.out.println(("the processor of the dell is:"+de.getProcessor()));

        Laptop lap1=new Dell();
        lap1.setPrice(45600);
        System.out.println("the price of the dell:"+lap1.getPrice());
        lap1.setWeight(43);
        System.out.println("the weight is :"+lap1.getWeight());


    }
}
