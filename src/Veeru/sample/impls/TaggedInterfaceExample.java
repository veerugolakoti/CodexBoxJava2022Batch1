package Veeru.sample.impls;

public class TaggedInterfaceExample implements Cloneable {

    public String name;

    public void display() {
        System.out.println("Inside Tagged Interface example");
    }

  public Object  getTaggedInterfaceExample () throws CloneNotSupportedException {
      return   clone();
    }
}
