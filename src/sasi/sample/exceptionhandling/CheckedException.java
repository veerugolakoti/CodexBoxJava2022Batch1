package sasi.sample.exceptionhandling;

public class CheckedException {
    private String car;
    private  Integer wheels;

    public String getCar() {
        return car;
    }
    public Integer getWheels() {
        return wheels;
    }
    public CheckedException (String car,Integer wheels){
        this.car = car;
        this.wheels = wheels;

    }
    public CheckedException getclone () throws CloneNotSupportedException{
        return (CheckedException) clone();

    }

}


