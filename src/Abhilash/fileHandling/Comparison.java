package Abhilash.fileHandling;

import java.util.Scanner;

public class Comparison {
    Scanner sc = new Scanner(System.in);
    int a,b;
    public void comparison() {
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] s3 =s1.split(".");
        String[] s4 = s2.split(".");
        for (int i = 0; i < s3.length; i++) {
            a = Integer.parseInt(s3[i]);
            b = Integer.parseInt(s4[i]);
        }
        if (a > b) {
            System.out.println("s1 is the latest version ");
        }else {
            System.out.println("s2 is latest version ");
        }
    }
}
