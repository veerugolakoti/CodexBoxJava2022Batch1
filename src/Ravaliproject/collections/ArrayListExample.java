package Ravaliproject.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public void doublemethod() {

        List<Double> list = new ArrayList<>();

        list.add(789.0);
        list.add(456.0);
        list.add(789.0);
        list.add(675.0);
        list.add(656.0);
        list.add(656.0);
        // list.add(656.0);
         int doublecount;


        for (int i = 0; i < list.size(); i++) {
            // for (int j = i + 1; j < list.size(); j++) {

            if (list.lastIndexOf(list.get(i)) != i) {


                //       if (list.size(list.get(i)) != i) {
                System.out.println(list.get(i) + " is duplicated " +   " count " + "times");

            }
        }

    }

}
        //    for (int i = 0; i < list.size(); i++) {
        // for (int j=i+1;j<list.length;j++);
        //      if (list.contains(list.get(i))) {
        //        System.out.println(list.get(i) + " is duplicated");
        //   }


        //   for(Double d:list) {
        //   if( new List.contains(elemnts)){
        //     newList.add(element);
        //   }
        //      return newList;










