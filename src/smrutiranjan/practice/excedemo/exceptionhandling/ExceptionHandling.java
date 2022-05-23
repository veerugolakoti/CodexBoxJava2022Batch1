package smrutiranjan.practice.excedemo.exceptionhandling;

public class ExceptionHandling  {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    private     String s;
    public ExceptionHandling(int i,String s){
        this.i = i;
        this.s = s;

    }

     public Object myException() // throws CloneNotSupportedException
     {
         ExceptionHandling eh = null;
         try {
             eh = (ExceptionHandling) eh.clone();

         } catch (CloneNotSupportedException e) {
           // throw new RuntimeException(e);
            // System.out.println(eh.i + " " + eh.s);
         }

         return myException();
     }
}
