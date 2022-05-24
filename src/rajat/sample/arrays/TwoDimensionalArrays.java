package rajat.sample.arrays;

public class TwoDimensionalArrays {
    public void twoDimensionalArrary(){
        int[][] arrDimension = new int[2][2];
        for (int a = 0; a< arrDimension.length; a++){
            for (int j = 0; j< arrDimension.length; j++){
                System.out.println("Row value a:: "+a);
                System.out.println(arrDimension[a][j]=(10+j));
            }
        }
    }


}
