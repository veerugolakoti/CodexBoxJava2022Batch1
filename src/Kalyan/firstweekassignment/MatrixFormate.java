package Kalyan.firstweekassignment;

public class MatrixFormate {
    public static void main(String[] args) {
        int[][] a={{1,0,0,},{0,1,0,},{0,0,1,}};
        char[][] b={{'p','q','r',},{'p','q','r',},{'p','q','r',}};
        int[][] e=new int[3][3];

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                e[k][l] = a[k][l] + b[k][l];
                System.out.print(" " +a[k][l]+ "+" +b[k][l]);
            }
            System.out.println();
        }
    }
}
