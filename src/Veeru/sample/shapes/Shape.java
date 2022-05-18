package Veeru.sample.shapes;

public class Shape {

    String color;

   public Shape() {
        System.out.println("I'm inside Shape");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

     double area() {
        return 3.5;
     }

  public void printMessage() {
       System.out.println("I'm inside Shape class printMessage() method with no parameters");
    }
  public void printMessage(String message) {
        System.out.println("I'm inside printMessage() method with Parameter: " + message);
    }
}
