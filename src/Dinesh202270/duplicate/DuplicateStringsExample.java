package Dinesh202270.duplicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateStringsExample {


    public void findDuplicates( List<String> list) {
    Scanner sc = new Scanner(System.in);
   // List<String> list = new ArrayList();

        /*for(int i = 0; i <5; i++) {
        System.out.println("enter value : " + (i + 1) + "  : ");
        list.add(sc.nextLine());
    }*/

    int count = 0;
    //  int dub = 0;


        for (int i = 0; i < list.size(); i++) {

        String dub =null;
        for (int j = i + 1; j < list.size(); j++) {        //1 1 1 2 2
            if (list.get(i).equalsIgnoreCase(list.get(j))) {
                count++;
                dub = list.get(j);

                list.set(j," ");
            }
        }
        if (count > 0  )
        {
            if(!(list.get(i).equalsIgnoreCase(" "))){

                System.out.println(dub + " is repeating " + count + " times");
            }
        }
        count = 0;
    }
//        for (String k:list) {
//        System.out.print(k +" ");
//    }

}

}
