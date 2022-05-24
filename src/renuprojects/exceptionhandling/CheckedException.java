package renuprojects.exceptionhandling;

import renuprojects.interfaces.Cat;

public class CheckedException extends Cat  {
    @Override
    public void run() {
        super.run();
    }

    @Override
    public void jump() {
        super.jump();
    }

    public Object getCheckedException(){
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
           //throw new RuntimeException(e);
            System.out.println("hi");
            e.printStackTrace();
        }
        //return getCheckedException();


        return null;
    }


}




