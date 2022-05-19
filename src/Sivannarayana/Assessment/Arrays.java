package Sivannarayana.Assessment;
public class Arrays {
    public static void main(String[] args) {
        int[] num = { 2, 4, 7, 55, 9 };
        int max = num[0];
        int min = num[0];
        for (int n :num) {
            if(max < n){
                max = n;
            }
        }
        for (int n :num) {
            if(min > n){
                min = n;
            }
        }
        System.out.println("Minimum number of array is : " + min);
        System.out.println("Maximum number of array is : "+ max);

    }
}
