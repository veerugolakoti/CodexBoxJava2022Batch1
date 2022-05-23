package Abhilash.inheritanceExample;

import Abhilash.interfaceEx.Interface1;
import Abhilash.interfaceEx.Interface2;

public class Inheritance_Impl implements Interface1, Interface2 {
    int id=10;
    String name;

    @Override
    public void Student() {
        id = 2/id;
//       double d= (double) id;
//        d =  Math.random()* 10000;
        System.out.println(id);
       // System.out.println(  id =  Math.random()* 10000);
        System.out.println(name = "Abhilash");

    }

    @Override
    public void employee() {

        System.out.println( id = 10);
        System.out.println(name = "Abhilash");

    }

    public static void main(String[] args) {
        Inheritance_Impl  inheritance_ = new Inheritance_Impl();
        inheritance_.Student();
        inheritance_.employee();

    }
}
