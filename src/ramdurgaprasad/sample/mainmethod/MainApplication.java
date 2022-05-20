package ramdurgaprasad.sample.mainmethod;
import ramdurgaprasad.sample.taggedinterface.Taggedinterface;
import ramdurgaprasad.sample.taggedinterface.object;

import java.util.*;
public class MainApplication {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("the values to print:");
        int strength = sc.nextInt();
        System.out.println("the office is ");
        String office= sc.next();
        System.out.println("the salary");
        float salry=sc.nextFloat();
        Taggedinterface ti=new Taggedinterface(29,"codexbox",12500.5f);



    }
}
