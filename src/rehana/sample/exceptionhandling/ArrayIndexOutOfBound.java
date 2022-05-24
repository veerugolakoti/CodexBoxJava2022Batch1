package rehana.sample.exceptionhandling;

public class ArrayIndexOutOfBound {
   /* public static void main(String[] args) {*/
    String array(){
        try{
            int a[] = new int[10];
            a[11] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayindexoutofbounds");

        }

        return array();

    }

}
