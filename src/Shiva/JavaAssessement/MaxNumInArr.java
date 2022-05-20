package Shiva.JavaAssessement;

public class MaxNumInArr {
    public static void main(String[] args) {
        int[] arr = {12,54,24,64,26};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum value in array :" + max);
    }
}
