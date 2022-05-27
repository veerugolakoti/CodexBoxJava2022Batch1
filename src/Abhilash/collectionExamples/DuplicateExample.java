package Abhilash.collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicateExample {
    public void duplicate() {
        List<String> list = new ArrayList<>();
        list.add("rajat");
        list.add("renuka");
        list.add("Abhilash");
        list.add("Junaid");
        list.add("vidya");
        list.add("teja");
        list.add("rajat");
        list.add("ravali");
        list.add("renuka");
        list.add("rajat");
        list.add("vidya");
        list.add("vidya");
        list.add("rajat");
        list.add("rajat");
        list.add("Abhilash");
        list.add("renuka");
        list.add("teja");
        list.add("teja");

        int count1 = 0;
        List<Integer> listCount = new ArrayList<>();
        List<String> duplicateName = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))) {
                    if (!duplicateName.contains(list.get(i))) {
                        duplicateName.add(list.get(i));
                    }
                    count1++;
                   // if (!listCount.contains(count1)) {
                        listCount.add( Collections.frequency(list, list.get(i)));
                        break;
                   // }
                }
            }
        }
        System.out.println(listCount);
        System.out.println(duplicateName);
        for(int k = 0;k< duplicateName.size();k++) {
            System.out.println("duplicate names are : " + duplicateName.get(k) + " number of reputations respectively :" + listCount.get(k) + " times.");
        }
    }
}
