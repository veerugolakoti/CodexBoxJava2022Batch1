package Dinesh202270.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dublicate {

    public void dublicate1() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList();

        for (int i = 0; i < 5; i++) {
            System.out.println("enter value : " + (i + 1) + "  : ");
            list.add(sc.nextInt());
        }

        int count = 0;
        //  int dub = 0;


        for (int i = 0; i < list.size(); i++) {
            int dub = 0;
            for (int j = i + 1; j < list.size(); j++) {        //1 1 1 2 2
                if (list.get(i) == list.get(j)) {
                    count++;
                    dub = list.get(j);

                    list.set(j,0);
                }
            }
            if (count > 0  )
            {
                if(list.get(i)!=0) {
                    System.out.println(dub + " is repeating " + count + " times");
                }
            }
            count = 0;
        }
        for (int k:list) {
            System.out.print(k +" ");
        }

    }

}