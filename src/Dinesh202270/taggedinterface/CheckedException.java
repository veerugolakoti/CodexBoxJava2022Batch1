package Dinesh202270.taggedinterface;

import java.util.concurrent.Callable;

public class CheckedException implements Cloneable{

    public static void main(String[] args) {
        CheckedException checkedException = new CheckedException();
        System.out.println(checkedException.exception());
    }

    public  CheckedException exception()
    {
       CheckedException checkedException = null;
        try{
            System.out.println();
            Object object = clone();
            checkedException =(CheckedException) object;
        } catch (CloneNotSupportedException e)
        {
            System.out.println("this is checked exception"+e.toString());
        }
        return checkedException;
    }

}
