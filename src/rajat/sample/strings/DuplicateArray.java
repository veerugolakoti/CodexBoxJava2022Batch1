package rajat.sample.strings;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {12,29,3,65,88,12,34,34,12,29};
        for (int i= 0;i< arr.length;i++){
            int count =0;

            for (int j=i+1;j< arr.length;j++){

                if(arr[i]==arr[j]){
                    count++;
//                    int k =arr[i];
//                    System.out.println("Duplicate"+arr[j]);
//                    break;
                }

            }
            System.out.println(count);
//            if(count>0){
//                System.out.println("Duplicate"+arr[i]);
            }
        }
    }

