package Abhilash.inheritanceExample;

import Abhilash.interfaceEx.Inheritancetypes;
import Abhilash.interfaceEx.inheritancetype2;

public class Inheritance_Impl implements Inheritancetypes, inheritancetype2 {
    int id;
    String name;

    @Override
    public void Student() {
        System.out.println(id = 470);
        System.out.println(name = "Abhilash");

    }

    @Override
    public void employee() {
        System.out.println( id = 202282);
        System.out.println(name = "Abhilash");

    }

    public static void main(String[] args) {
        Inheritance_Impl  inheritance_ = new Inheritance_Impl();
        inheritance_.Student();
        inheritance_.employee();

    }
}
