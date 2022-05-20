package Sohail.sample.Javatraining;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] a = {20, 30, 40,80, 50, 40,20,80};
        for (int i=0;i<a.length; i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i]==a[j] && i!=j){
                    System.out.println("The Duplicate Element are : "+a[i]);
                }

            }
        }

    }
}
