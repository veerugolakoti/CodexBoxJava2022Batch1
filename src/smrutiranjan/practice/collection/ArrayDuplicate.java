package smrutiranjan.practice.collection;

public class ArrayDuplicate {
    public void arrayduplicate(){
        int[] a= new int[]{1,2,3,2,4,5,2};
        int count = 0;
        for(int i = 0; i<a.length; i++ ){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    count++;

                }
            }
        } System.out.println("duplicte in array :"+count);
    }
}
