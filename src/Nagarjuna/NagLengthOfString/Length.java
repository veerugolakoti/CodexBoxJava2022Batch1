package Nagarjuna.NagLengthOfString;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        str = sc.nextLine();
        System.out.println("length of the string is " + getLength(str));
    }



   /* private static int getLength(String str) {
        int length=0;
       char[] strCharArray=str.toCharArray();
        for (char c:strCharArray ) {
            length ++;

        }
        return length;
    }
    }*/

    private static int getLength(String str) {
        int i = 0;
        try {
            for (i = 0; ; i++) {

                str.charAt(i);
            }
            } catch(Exception e){

            }
            return i;


    }
}