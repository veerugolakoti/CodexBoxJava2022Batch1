package Swathi.MarkerInterfaceEx;

import Swathi.MarkerInterfaceEx.Cloneable;

public class Student implements Cloneable {
    String name;
    int age;
    public Object getinterfacemethod() throws CloneNotSupportedException {  //object is a writtentype
        return clone();
    }
}
