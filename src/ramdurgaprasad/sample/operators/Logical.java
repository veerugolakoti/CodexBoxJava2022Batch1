package JavaTraining.operators;

public class Logical {
    public static void main(String[] args) {
        int ram1=23,ram2=24,ram3=24;
        System.out.println(ram1);
        System.out.println(ram2);
        System.out.println(ram3);
        if((ram1<ram2)&&ram2==ram3) {
          int  sum = ram1 + ram2 + ram3;
            System.out.println("the sum of numbers" + sum);
        }else{
            System.out.println("false condition");
        }
    }
}
