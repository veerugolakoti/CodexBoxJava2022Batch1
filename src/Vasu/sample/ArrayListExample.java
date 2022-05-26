package Vasu.sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public void list(){

        List<String> list = new ArrayList<>();

        list.add("vasu");
        list.add("sandeep");
        list.add("madhu");
        list.add("srikanth");
        list.add("srinivas");
        list.add("hari");
        list.add("kishore");
        list.add("mahesh");
        list.add("sai");
        list.add("prasad");
        list.add("hari");
        list.add("sai");
        list.add("sai");
        //System.out.println(list);
        int count = 0;
        String duplicateName = null;

        for (int m = 0; m < list.size(); m++) {
            for (int n = 1; n < list.size(); n++) {
                if (list.get(m).equalsIgnoreCase(list.get(n))) {
                    count++;
                    duplicateName = list.get(n);

                    break;
                }
            }
        }
        System.out.println("duplicate name:"+duplicateName);

    }


}


