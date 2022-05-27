package ramdurgaprasad.sample.operators;

public class ForEach {
    public static void main(String[] args) {
        int d=1;int a[]={1,2,3,4,5,5};
        for(int x:a){
            System.out.println(x);

        }
        do{
            System.out.println("9 =" + d);
            d++;
        }  while(d<=10);
    }
}
