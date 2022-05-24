package sasi.sample.exceptionhandling;

public class Mainchecked {
    public static void main(String[] args)  throws CloneNotSupportedException
    {
        CheckedException e1 = new CheckedException("pajero", 4);
        try{
            CheckedException e2 = e1.getclone();
            System.out.println(e2.getCar());
            System.out.println(e2.getWheels());
        }catch(Exception e){
            System.out.println("this is exception ");

        }

    }
}
