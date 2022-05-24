package Abhilash.inheritanceExample;

import Abhilash.interfaceEx.Interface1;
import Abhilash.interfaceEx.Interface2;

public class Inheritance_Impl implements Interface1, Interface2 {
    int id ;
    String name;

    @Override
    public void Student() {
        int id = 10;
        id = (int) (Math.random()* 101);
        System.out.println(id );
        System.out.println(name = "Abhilash");

    }

    @Override
    public void employee() {

        System.out.println( id = 10);
        System.out.println(name = "Abhilash");

    }

}
