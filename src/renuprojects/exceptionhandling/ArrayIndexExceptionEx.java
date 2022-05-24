package renuprojects.exceptionhandling;

public class ArrayIndexExceptionEx {
    public void array() {
        int[] arr = new int[3];
        try {
            int i = arr[3];
            System.out.println("array index out of bound");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(arr.length);
        }
        finally {
            arr[0]=6;
            System.out.println(arr[0]);
        }
    }
}




