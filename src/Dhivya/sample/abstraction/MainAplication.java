package Dhivya.sample.abstraction;
public class MainAplication {
    public static void main(String[] args) {
        Model1 model1 = new Model1();
        model1.setPrice(20000);
        model1.setMemory("32 GB");
        model1.setSize(12);
        System.out.println("model 1 price: " + model1.getPrice());
        System.out.println("model 1 memory: " + model1.getMemory());
        System.out.println("model 1 size: " + model1.getSize());
        System.out.println();
        Model2 model2 = new Model2();
        model2.setPrice(30000);
        model2.setMemory("64 GB");
        model2.setSize(24);
        System.out.println("model 2 price: " + model2.getPrice());
        System.out.println("model 2 memory: " + model2.getMemory());
        System.out.println("model 2 size: " + model2.getSize());
    }
}
