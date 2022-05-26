package renuprojects.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExampleOfInteger {
    public void listMethod() {
        List<Integer> integerlist = new ArrayList<>();
        integerlist.add(22);
        integerlist.add(25);
        integerlist.add(10);
        integerlist.add(45);
        integerlist.add(45);
        integerlist.add(12);
        integerlist.add(10);
        integerlist.add(36);
        System.out.println("size of the list is :" + integerlist.size());

        for (int i = 0; i < integerlist.size(); i++) {
            if (integerlist.lastIndexOf(integerlist.get(i)) != i) {

                System.out.println("dublicate integer is: " + integerlist.get(i));
            }

        }
    }
}