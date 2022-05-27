package JavaTraining.javaassessment;

public class AdditionOfTwoDArray {
    public static void main(String[] args) {
        int a[][]={{1,2,3,},{12,3,5},{1,2,1},{1,1,1}};
        int b[][]={{1,2,2},{5,5,5},{5,6,8},{5,5,5,}};
        int c[][]={{1,1,1},{2,2,2},{3,3,3},{7,8,9}};
        for(int i=0;i<4;i++) {
            for(int j=0;j<3;j++){
                System.out.print( (a [i] [j]+b [i] [j])* c[i][j]+ " ");


        }
            System.out.println();
        }

    }
}
