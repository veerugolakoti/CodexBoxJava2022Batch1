package ramdurgaprasad.sample.starpatterns;

public class Patterns {
    public static void main(String[] args) {
        int arr=5;


        for(int i=0;i<arr;i++)
        {
            for(int j=0;j<arr;j++) {
                if(i==0||i==arr-1||j==0||j==arr-1){
                    System.out.print(" * ");}
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
        System.out.println("\n\n\n");

        {
            int[] arr1=new int [11];
            int mid=arr1.length/2;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if(mid==i||mid==j || i==0 || i==arr1.length-1|| j==0||  j==arr1.length-1){
                        System.out.print(" 8 ");
                    }else
                        System.out.print("   ");

                }
                System.out.println();

            }

        }
    }
}


