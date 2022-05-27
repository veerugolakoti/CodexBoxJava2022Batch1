package Dinesh202270.duplicate;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateElements {

    public void findDuplicate() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            System.out.println("enter value : " + (i + 1) + "  : ");
            list.add(sc.nextInt());
        }

        int count = 0;
        //  int dub = 0;


        for (int i = 0; i < list.size(); i++) {
            int dup = 0;
            for (int j = i + 1; j < list.size(); j++) {        //1 1 1 2 2
                if (list.get(i) == list.get(j)) {
                    count++;
                    dup = list.get(j);

                    list.set(j,0);
                }
            }
            if (count > 0  )
            {
                if(list.get(i)!=0) {
                    System.out.println(dup + " is repeating " + count + " times");
                }
            }
            count = 0;
        }
        for (int k:list) {
            System.out.print(k +" ");
        }

    }

}