package Sohail.sample.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

    public void m() {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("1");
        list.add("1");
        list.add("3");

        list.size();
        List<String> duplicateName = new ArrayList();
        List<Integer> duplicateCount = new ArrayList<>();
        Integer count = 1;
        String str = null;


        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))) {
                    duplicateCount.add(count++);
                    System.out.println(list.get(count));

                }
                duplicateName.add(list.get(j));
                break;
            }

        }

        System.out.println("The  Duplicates are : " + duplicateName);
        System.out.println(" and repeated : " + duplicateCount);
    }
}











