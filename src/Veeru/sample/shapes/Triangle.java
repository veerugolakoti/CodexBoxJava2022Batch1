package Veeru.sample.shapes;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle() {

    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
   public double area() {
        //System.out.println("Area of Triangle is : " + (0.5)*base*height);
        return (0.5)*base*height;
    }

   // @Override
   public void printMessage() {
        System.out.println("I'm inside Triangle class printMessage() method with no parameters");
    }

  public int getHeight() {
        return  height;
    }
}
