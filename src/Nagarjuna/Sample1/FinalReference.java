package Nagarjuna.Sample1;

public class FinalReference {
    public static void main(String[] args) {
       final Reference r1=new Reference();
        System.out.println(r1.x=12);
         Reference r2=new Reference();
        System.out.println(r2.x=16);
    }
}
