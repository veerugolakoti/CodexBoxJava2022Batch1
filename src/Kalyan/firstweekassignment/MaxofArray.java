package Kalyan.firstweekassignment;

public class MaxofArray {
    public static void main(String[] args) {
        int[] arr = {0, 25, 50, 75, 1250, 125};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("" +max);
    }
        }

