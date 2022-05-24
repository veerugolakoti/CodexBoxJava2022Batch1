package ramdurgaprasad.sample.exceptionhandling;
import java.util.*;
public class ArrayIndexBoundExceptions {
    public void getArrayIndexBound() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] arry = new int[100];
       // for (int j = 0; j < arry.length; j++) {

                try {
                    if(arry.length<=i)
                      {

                          throw new ArrayIndexOutOfBoundsException("out of bound");
                    }



                } catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("Array length is less so less your index number");
                }
            }
        }
