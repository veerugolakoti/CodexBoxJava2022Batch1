package renuprojects.exceptionhandling;

public class NullPointerExceptionEx {
    public String name=null;
    public void methodEx() {
       // try {
            if (name == null) ;
            System.out.println(name.length());
        //} catch (NullPointerException e) {
            System.out.println("null pointer exception");
        //}

    }
}
