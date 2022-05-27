package ramdurgaprasad.sample.dataflow;

public class IfConditions {
    public static void main(String[] args) {
        int i=24,t=100,m=100;
        if(i>t) {
            System.out.println("i is greater");
        }else{
            System.out.println("i is less");
            if(i==m){
                System.out.println("i euals mS");

            }if(t==m){
                System.out.println("t equals m");
            }

        }
    }
}
