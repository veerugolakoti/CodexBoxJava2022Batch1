package rajat.sample.practice;

public class ArmstrongNumberApplication {
    public static void main(String[] args) {
        int num=1234;
        int num1=num;
        int len=0;
        while(num1>0){
            len++;
            num1=num1/10;

        }
        int num2=num;
        for(int i=1;i<=len;i++){
            int rem=0;
                    rem=rem+(num2%10);

        }
    }
}
