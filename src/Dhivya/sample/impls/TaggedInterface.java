package Dhivya.sample.impls;

public class TaggedInterface implements Cloneable {
     public String name;

    public void show() {
        System.out.println("Hello Clone");
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
