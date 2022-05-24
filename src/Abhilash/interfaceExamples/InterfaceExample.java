package Abhilash.interfaceExamples;

public class InterfaceExample implements Cloneable,Interface1{
    public String s = "ABHILASH";

    public Object  getInterfaceExample()  {

        try {
            return clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported exception");
        }
        return null;
    }

    @Override
    public void employee() {
        double id = Math.random()*1000;
        System.out.println(id);
    }

    @Override
    public void Student() {

    }
}
