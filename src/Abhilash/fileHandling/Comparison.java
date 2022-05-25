package Abhilash.fileHandling;

import java.util.Scanner;

public class Comparison {
    Scanner sc = new Scanner(System.in);
    public void comparison() {
        String s1 = sc.next();
        String s2 = sc.next();
        for (int i = 0; i < s1.length(); i++) {
            int ch1 = s1.charAt(i);
            int ch2 = s2.charAt(i);
            if( s1.charAt(i) < s2.charAt(i)){
                System.out.println("s2 is the latest version ");
            }else if(s1.charAt(i) > s2.charAt(i)) {
                System.out.println("s1 is the latest version ");
            }
            else {
                System.out.println("nothing");
            }

        }


//    if() {
//        System.out.println("s2 is the latest version");
//    }
//    else {
//        System.out.println("s1 is the latest version");

//    }
    }
}
