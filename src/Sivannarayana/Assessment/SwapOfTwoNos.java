package Sivannarayana.Assessment;

import java.util.Scanner;

public class SwapOfTwoNos{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first number :");
            int i= sc.nextInt();
            System.out.println("Enter the second number :");
            int j= sc.nextInt();
            System.out.println("Before swapping of i="+i+" and j="+j);
            int temp=i;
            i=j;
            j=temp;
            System.out.println("After swapping of i="+i+" and j="+j);



        }
    }


