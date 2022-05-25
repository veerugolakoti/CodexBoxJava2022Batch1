package Vasusample.Exceptionhandling.UnCheckedException;

public class UnChackedExceptionExample2 {
    public void arrayexample(){
        try{
            int array[]=new int[]{1,2,3,4,5};
            System.out.println(array[6]);
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException");;
        }
    }
}
