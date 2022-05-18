package Veeru.sample.shapes;

public class Rectangle extends  Shape {

    public  Rectangle( ) {
        super();
    }
   private int length;
  private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double area() {
       // System.out.println("Area of Rectangle is: " + length * breadth);
        return length * breadth;
    }

    public void printMessage() {
        //System.out.println(HelloWorldApplication.WELCOME_MESSAGE);
        System.out.println("I'm inside Rectangle class printMessage() method with no parameters");
    }

    void testSuper() {
        System.out.println(super.color);
    }
}
