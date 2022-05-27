package ramdurgaprasad.sample.operators;

public class AssignmentApplication {
    public static void main(String[] args) {
        int num1= 10, num2 = 20;

        int numa=num1+= num2;//num1=num1+num2
        System.out.println(numa);
        int numb=num1-= num2;//num1=num1-num2
        System.out.println(numb);
        int numc=num1*= num2;//num1=num1*num2
        System.out.println(numc);
       int numd= num1 /= num2;//num1=num1/num2
        System.out.println(numd);
       int nume= num1%= num2;//num1=num1%num2
        System.out.println(nume);
    }

}
