package Shiva.JavaAssessement;

public class TwoDim {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = 11;
        arr[0][1] = 22;
        arr[1][0] = 99;
        arr[1][1] = 88;
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
