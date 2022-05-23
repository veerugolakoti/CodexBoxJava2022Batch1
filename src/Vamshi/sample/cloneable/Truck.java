package Vamshi.sample.cloneable;

import javax.swing.*;

public class Truck implements Cloneable {
     public Integer number;
    public String  numberplate;
    public String  color;
    public Truck(Integer number, String numberplate,String color){
        this.number = number;
        this.numberplate = numberplate;
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
