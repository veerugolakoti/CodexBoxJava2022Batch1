package rajat.sample.exceptionhandeling;

public class ArrayIndexBoundOfExceptionClass {
    public void getArrayIndexBound(){
        int[] arry = new int[12];
        //run time exception
        try {
            int i = arry[20];
            System.out.println(i);
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Array length is less so less your index number");
        }
    }
}
