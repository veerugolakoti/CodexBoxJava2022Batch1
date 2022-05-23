package chandan.markerinterface;

import java.util.Scanner;

public class MainGroceryItems {
        public static void main(String[] args) throws CloneNotSupportedException{

            // reading values of items from user
            Scanner sc = new Scanner(System.in);
            System.out.println("enter item batch_no");
            int batch_no = sc.nextInt();
            System.out.println("enter item name");
            String name = sc.next();
            System.out.println("enter item cost");
            double cost = sc.nextDouble();

            GroceryItems i1 = new GroceryItems(batch_no,name,cost);
            // cloning object of grocery items using clone() method
            GroceryItems i2 = (GroceryItems)i1.cloneMethod();
            // invoking the method to print details
            i2.display();
        }
    }

