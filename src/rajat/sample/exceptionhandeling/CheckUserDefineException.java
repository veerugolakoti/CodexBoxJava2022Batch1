package rajat.sample.exceptionhandeling;

public class CheckUserDefineException {
   public void getCheckedUser() throws UserCheckedException {
        int a=10,b=0;
        try {
            int c = a / b;
            System.out.println(c);
        }catch (ArithmeticException e){
            throw new UserCheckedException(e.getMessage());

        }
    }

}
