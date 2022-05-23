package TejaAravind.Interfaces;

public class MarkerImpl implements Marker,Cloneable {
    int add  = 45+659;


    @Override
    public void display() {
        System.out.println("Iam in marker implementation");
        System.out.println(this.add);

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        MarkerImpl impl = new MarkerImpl();
//        System.out.println(impl.add);
        impl.display();
        MarkerImpl implClone = (MarkerImpl) impl.clone();
        implClone.add = 7945+884;
        implClone.display();
        System.out.println(implClone.empid);
    }
}
