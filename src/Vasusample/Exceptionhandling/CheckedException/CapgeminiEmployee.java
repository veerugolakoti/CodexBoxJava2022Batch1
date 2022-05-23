package Vasusample.Exceptionhandling.CheckedException;



public class CapgeminiEmployee extends Employee implements Cloneable {
    @Override
    String careerpersentage() {
        return "60%";
    }

    @Override
    String qualification() {
        return "b.tech,m.tech";
    }
    public CapgeminiEmployee getCapgeminiEmployee(){
        try {
            return (CapgeminiEmployee) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("This exception comes when your class doesn't implement Cloneable inteface");

        }
        return null;


    }

}
