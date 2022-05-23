package Abhilash.interfaceEx;

public class InterfaceExample implements Cloneable,Interface1{
    String s = "ABHILASH";

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
        double id = Math.random();
        System.out.println(id);
    }

    @Override
    public void Student() {

    }
}
