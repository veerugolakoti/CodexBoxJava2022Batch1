package TejaAravind.exceptionhandling;

public class MainUCH {
    public static void main(String[] args) {
        Human human1 = new Human("sangam", "coder");
        try{
            human1.getUncheckedException();
        }catch (TejaUncheckedException e){
            System.out.println(e.getMessage());
        }

    }
}
