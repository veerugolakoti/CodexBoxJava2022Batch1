package ramdurgaprasad.sample.arrays;

public class ArraysApplication {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,};
        for(int i=0;i<arr.length; i++){


            if (arr[i]==2){
                System.out.println("chandan");
            }
        }
        int arr1[][]={{2,4,5},{2,5,67},{4,7,89},{2,2,2}};

        int arr2[][]={{2,4,5},{2,5,67},{4,7,89}};

        int arr3[][] ;

        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1 [i] [j]+"  ");
            }

            System.out.println();
        }
        System.out.println();


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1 [i] [j]+arr2[i][j] +" ");
            }

            System.out.println();
        }




    }
}
