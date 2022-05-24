package rajat.sample.loops;

public class ForloopsApplication {
    public void getForLoop() {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int k = 1; k <=5; k++){
            int p=1;
            for (int l = 5; l>k; l--){
                System.out.print(p++);
            }
            System.out.println();
        }

    }
}
