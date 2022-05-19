package rajat.sample.assessment.assessment1;

public class MaximumArrayApp {
    public static void main(String[] args) {
        int[] arr={12,23,45,5730,78,9,90};
        int maxArray=arr[0];

        for (int i=1;i<arr.length;i++) {
            if(arr[i]>maxArray) {

              maxArray=arr[i];
            }

        }
        System.out.println("Check the maximum number of Array::"+maxArray);
    }
}
