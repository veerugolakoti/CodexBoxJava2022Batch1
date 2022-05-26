package rajat.sample.strings;

import java.util.Scanner;

public class PalindromeStringApp {
    public void getPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string::");
        String strOriginal = sc.nextLine();
        String originalStr = strOriginal;
        int len=originalStr.length();
        String strReverse ="";
        for (int i=len-1;i>=0;i--){
            strReverse += originalStr.charAt(i);
        }
        System.out.println(strReverse);
        if( strOriginal.equals(strReverse)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
