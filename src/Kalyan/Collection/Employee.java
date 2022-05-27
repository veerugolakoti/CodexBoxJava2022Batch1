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
        int count = 0;
        String temp = "";
        for (int i = 0; i < li.size(); i++) {
            if (li.lastIndexOf(li.get(i)) !=i){
                count++;
                continue;
            }
            System.out.println(temp+" "+count+"");
        }
    }
}





