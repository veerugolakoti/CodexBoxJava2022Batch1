package rajat.sample.abstraction;

public class MahindraCar extends Car{
    private int topSpeede;
    private String color;
    public MahindraCar(String color,int topSpeede){
        this.topSpeede=topSpeede;
        this.color=color;
        System.out.println("Car color is::"+color);
        System.out.println("Top Speed of car is::"+topSpeede);
    }

    @Override
    public void carEngine() {

        System.out.println("Petrol Engin");

    }

    @Override
    public void seatDesign() {
        System.out.println("4 seater capacity");
        System.out.println(topSpeede);
        System.out.println(color);

    }
}
