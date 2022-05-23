package Nagarjuna.Palindrome;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int i;
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        str=sc.nextLine();
        String reverseStr="";
        for (i=str.length()-1;i>=0;i--) {
            reverseStr=reverseStr+str.charAt(i);
        }
        if(str.equals(reverseStr)) {
            System.out.println("the given string is palindrome");
        } else {
            System.out.println("the given string is not palindrome");
        }
    }
}
