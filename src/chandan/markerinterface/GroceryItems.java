package chandan.markerinterface;

public class GroceryItems implements Cloneable {
    int batch_no ;
    String itemName ;
    double cost ;
    // item class contructor
    public GroceryItems(int batch_no, String itemName, double cost){
this.batch_no = batch_no;
this.itemName = itemName;
this.cost = cost;
    }
    //details on the console
    public void display(){
        System.out.println("item batch_no :" +batch_no);
        System.out.println("item name : " +itemName);
        System.out.println("item cost : " +cost);
    }
    public Object cloneMethod() throws CloneNotSupportedException {
        return clone();
    }

}
