package Shiva.CollectionsProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DifferentMethodsInArrayList {
    public void differentMethods() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);


        System.out.println("The third index position: " + list.get(3));

        System.out.println();

        System.out.println("Is present: " + list.contains(98));

        System.out.println();

        System.out.println("The size of the list: " + list.size());

        System.out.println();

        System.out.println("Is equals: " + list.equals(77));

        System.out.println();

        System.out.println("The index of element: " + list.indexOf(55));

        System.out.println();

        System.out.println("Is the list empty: " + list.isEmpty());

        System.out.println();

        list.remove(2);
        System.out.println("After removing the element: " + list);

        System.out.println();

        Collections.sort(list);
        System.out.println("After sorting: " + list);

        System.out.println();
        System.out.println("Sub list: " + list.subList(1, 4));

        System.out.println();

        Iterator<Integer> iter =  list.iterator();
        System.out.println("Iterating");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println();

        newList.addAll(list);
        System.out.println(newList);

        System.out.println();

        list.clear();
        System.out.println("clear() method clears the list: " + list);


    }
}
