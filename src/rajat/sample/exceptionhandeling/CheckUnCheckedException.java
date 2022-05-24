package rajat.sample.exceptionhandeling;

public class CheckUnCheckedException {
    public void getUnChecked(){
        int[] arry = new int[12];
        //run time exception
        try {
            int i = arry[20];
            System.out.println(i);
        }catch (ArrayIndexOutOfBoundsException a){
            try{
            throw new UserDefinedUnCheckedException(a.getMessage());
        }catch (UserDefinedUnCheckedException un){
                System.out.println("Provide valid index number...");
            }
        }
    }
}
