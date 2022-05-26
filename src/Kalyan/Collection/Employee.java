package Kalyan.Collection;

import java.util.ArrayList;
import java.util.List;

public class Employee {

   public void testExample() {
       List<String> li = new ArrayList<>();
       li.add("naresh");
       li.add("ram");
       li.add("kalyan");
       li.add("teja");
       li.add("kalyan");
       li.add("vamshi");
       li.add("sangam");
       li.add("vamshi");
       li.add("Kalyan");
       li.add("chandan");
       List<String> temp = new ArrayList<>();
       List<Integer> getCount =  new ArrayList<>();
       int count=0;
        for (int i=0;i<li.size();i++) {
            for (int j = i+1; j < li.size(); j++) {
                if (li.get(i).equalsIgnoreCase(li.get(j))) {
                    count++;
                    if (temp.contains(li.get(j))){
                        break;
                    }else {
                        temp.add(li.get(i));
                        getCount.add(count);
                    }
                }
            }
        }
       System.out.println(temp+" dublicated "+getCount+" times");
   }
    }


