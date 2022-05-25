package Abhilash.inheritanceExample;

import java.util.Scanner;

public class PatternExample {
    public void pattern() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("");

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("");

        for(int i=0;i<n;i++){
            for(int j=i ;j<n;j++){
                if(i+j == 3){
                    System.out.println(" ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("");

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("");
    }


}
