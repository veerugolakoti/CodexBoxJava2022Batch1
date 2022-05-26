package Dhivya.sample.exceptionhandling;
import java.util.Scanner;
public class ArrayIndex {

    public void getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a value : ");
        int value = scanner.nextInt();
        int[] array = new int[100];
        {
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;

            }
            try {
                if (array.length <= value) {
                    throw new ArrayIndexOutOfBoundsException();

                }
               // array[101] = 56;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index out of bound exception");
            }
        }
    }

}




