package Ravaliproject.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListExample {
    public void doublemethod() {

        List<Double> list = new ArrayList<>();

        list.add(656.0);
        list.add(456.0);
        list.add(656.0);
        list.add(789.0);
        list.add(789.0);




      /*  for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.equals(i)) {

                }
                System.out.println("duplicate is : ");
            }*/


            //  set<double>

            // Map<Double,Integer>map=new HashMap<Double, Integer>();

            for (int i = 0; i < list.size(); i++) {
                 int count = 1;

                if (list.lastIndexOf(list.get(i)) != i) {
                    count++;

                    System.out.println(list.get(i) + " is duplicated " +  "times");


                }
                break;

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










