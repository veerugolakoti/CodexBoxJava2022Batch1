package smrutiranjan.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDuplicateValue {
    public void duplicatevalue() {
        List<String> empdetails = new ArrayList();
        empdetails.add("ram");
        empdetails.add("hari");
        empdetails.add("ganesh");
        empdetails.add("sambit");
        empdetails.add("ram");
        empdetails.add("jeet");
        empdetails.add("jeet");

        String str = "";
        int count = 0;

        List<Integer> duplicateCount = new ArrayList<>();
        List<String> duplicateName = new ArrayList<>();

        for (int i = 0; i < empdetails.size(); i++) {
            for (int j = i + 1; j < empdetails.size(); j++) {

                if (empdetails.get(i).equals(empdetails.get(j))) {
                    if (duplicateName.contains(empdetails.get(i))) {
                        break;
                    } else {
                        duplicateName.add(empdetails.get(i));
                    }
                    if(duplicateCount.contains(empdetails.get(1))){
                        break;
                    }else{
                        duplicateCount.add(count++);
                    }
                }
            }
        }
            System.out.println("DuplicateName:" + duplicateName + " times :" + duplicateCount);

    }
}