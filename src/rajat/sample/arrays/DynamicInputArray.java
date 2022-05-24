package rajat.sample.arrays;

public class DynamicInputArray {
    public void dynamicInput() {
        int arr[];
        arr = new int[10];
        for(int j=0;j<arr.length;j++){
            System.out.println("Dynamic value");
            System.out.println(arr[j]=10+j);
        }
    }


        public void getManualInput() {


        int[] countArray = new int[5];
        countArray[0]=10;
        countArray[1]=90;
        countArray[2]=70;
        countArray[3]=40;
        countArray[4]=50;
        for(int i=0;i<countArray.length;i++){
            System.out.println("the value of array:"+countArray[i]);
        }



    }
}
