package rajat.sample.strings;

import java.util.Scanner;

public class ReverseStringApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string::");
        String strOriginal = sc.nextLine();
        int len=strOriginal.length();
        String strReverse = " ";
        for (int i=len-1;i>=0;i--){
            strReverse += strOriginal.charAt(i);
        }
        System.out.println(strReverse);
    }
}
