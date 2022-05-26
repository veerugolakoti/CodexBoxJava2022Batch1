package Nagarjuna.collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicateValue {


    public void duplicatevalues() {
        List<String> values = new ArrayList();
        values.add("nag");
        values.add("prasad");
        values.add("rakesh");
        values.add("nag");
        values.add("prasad");
        values.add("nag");
       Integer count = 0;
        List<Integer> duplicateCount = new ArrayList<>();
        List<String> duplicatename = new ArrayList<>();

        for (int i = 0; i < values.size(); i++) {
//
            for (int j = i + 1; j < values.size(); j++) {
                if (values.get(i).equalsIgnoreCase(values.get(j))) {

                    duplicatename.add(values.get(j));
                   duplicateCount.add(count);


                    break;

                }
            }
        }

        System.out.println(duplicatename + " is duplicated " + duplicateCount + " times");

    }
}




