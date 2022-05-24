package chandan.uncheckedexception;

public class UncheckedMain {
    public void uncheckedexception() {

        try{
            int n = 50/5;
            System.out.println("entering try block");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
