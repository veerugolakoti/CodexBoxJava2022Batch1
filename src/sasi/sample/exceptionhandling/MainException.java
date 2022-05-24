package sasi.sample.exceptionhandling;

public class MainException {
    public static void main(String[] args)  throws CloneNotSupportedException
    {
        ExceptionHandling e1 = new ExceptionHandling("pajero", 4);
//        ExceptionHandling e2 = e1;
//        System.out.println(e2.getWheels());
//        System.out.println(e2.getCar());

        try{
            ExceptionHandling e2 = e1.getclone();
            System.out.println(e2.getCar());
            System.out.println(e2.getWheels());
        }catch(Exception e){
            System.out.println("this is exception ");

        }

    }
}
