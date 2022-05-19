package rajat.sample.practice;

public class PalindromeNumber {

    public static void main(String[] args) {
        int rev,sum=0,temp;
        int n=4546;

        temp=n;
        while(n>0){
            rev=n%10;
            sum=(sum*10)+rev;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");


   }
}
