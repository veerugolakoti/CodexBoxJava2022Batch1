package sasi.sample.exceptionhandling;

import sasi.sample.Clonneable;

public class ExceptionHandling {
    private String car;
    private  Integer wheels;

    public String getCar() {
        return car;
    }
    public Integer getWheels() {
        return wheels;
    }
    public ExceptionHandling (String car,Integer wheels){
        this.car = car;
        this.wheels = wheels;

    }
    public ExceptionHandling getclone () throws CloneNotSupportedException{
        return (ExceptionHandling) clone();

    }

}
