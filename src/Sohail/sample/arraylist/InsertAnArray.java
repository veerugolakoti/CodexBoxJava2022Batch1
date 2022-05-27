package Sohail.sample.arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAnArray {
    public void m4() {


        int a1[] = {10, 20, 30, 40, 50, 60};
        int a2[] = new int[a1.length+1];
        int a3[]= new int [a2.length+1];

        int index;
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index number : ");
        index = scanner.nextInt();
        System.out.println("Enter the value to be Inserted : ");
        value = scanner.nextInt();
        int count = 0;
        for(int i = 0 ; i< a1.length;i++){
            if (index==i){
               a2[index] =value;
                a3[index] = value;
                count ++;
            }
            a2[count]=a1[i];
            a3[count+1]=a2[i];
            count++;

        }

        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));


       /* for (int i=0;i<a2.length;i++){
            if(index==i) {
                a3[index] = value;
                count++;
            }
            a3[count]=a2[i];
            count++;
            }
        System.out.println(Arrays.toString(a3));*/
        }


    }
