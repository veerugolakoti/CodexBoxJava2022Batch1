package renuprojects.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExampleOfInteger {
    public void listMethod() {
        List<Integer> integerlist = new ArrayList<>();
        integerlist.add(36);
        integerlist.add(36);
        integerlist.add(10);
        integerlist.add(45);
        integerlist.add(60);
        integerlist.add(12);
        integerlist.add(10);
        integerlist.add(12);
        System.out.println("size of the list is :" + integerlist.size());
        //List<String> stringslist=new ArrayList<>();
        List<Integer> intlist=new ArrayList<>();
        int count=1;

        for (int i = 0; i < integerlist.size(); i++) {
            for(int j=i+1; j<integerlist.size(); j++){


                System.out.println("dublicate integer is: " + integerlist.get(i));

            }

        }
    }
}