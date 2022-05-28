package smrutiranjan.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMethods {
    public void arrayListMethods(){
        List<String> myList = new ArrayList();
        myList.add("ram");
        myList.add("hari");
        myList.addAll(1, Collections.singleton("retika"));


        List<Integer> myList2 = new LinkedList<>();
        myList2.add(12);
        myList2.add(51);





        System.out.println("contains():"+myList.contains("raaam"));
        System.out.println(myList.get(1));
        System.out.println("addAll() result:"+myList);
    }

}
