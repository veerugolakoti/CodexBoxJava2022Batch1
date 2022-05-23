package GANESH.arr;

public class MultidimensionalarrayApplication {
    public static void main(String[] args) {

        int array[][] = new int[4][4];

        array[0][0] = 300;
        array[0][1] = 280;
        array[0][2] = 260;
        array[0][3] = 240;
        array[1][0] = 220;
        array[1][1] = 200;
        array[1][2] = 180;
        array[1][3] = 160;
        array[2][0] = 140;
        array[2][1] = 120;
        array[2][2] = 100;
        array[2][3] = 80;
        array[3][0] = 60;
        array[3][1] = 40;
        array[3][2] = 20;
        array[3][3] = 0;
        for (int jlg = 0; jlg< array.length;jlg++) {
            for (int ganesh = 0; ganesh < array.length; ganesh++) {
                System.out.print(array[jlg][ganesh] + " ");

            }
            System.out.println();
        }
    }
}
