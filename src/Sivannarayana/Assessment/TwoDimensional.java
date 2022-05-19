package Sivannarayana.Assessment;

public class TwoDimensional {
    public static void main(String[] args) {
        char arr[][] = { {'A','B','C'},{'A','B','C'},{'A','B','C'} };
        for (int m=0; m< 3 ; m++) {
            for (int n = 0; n < 3; n++) {
                System.out.print(arr[m][n] + " ");
            }
            System.out.println();
        }
    }
}
