package Abhilash.exceptionhandling;

public class UsingFinally {
    public void finallyEx() {
        String s = null;
        try{
            s = String.valueOf(Float.parseFloat(("22")));
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("completed");
        }
    }


}
