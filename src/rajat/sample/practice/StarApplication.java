package rajat.sample.practice;

public class StarApplication {
    public static void main(String[] args) {
        int num=7;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //System.out.println("Reverse star Program");
        for(int i=1;i<num;i++){
            for(int j=num;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
