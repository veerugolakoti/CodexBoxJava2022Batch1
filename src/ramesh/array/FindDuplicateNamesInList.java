package ramesh.array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNamesInList {
    public void testMyArrayList() {
        List<String> employeList = new ArrayList<>();
        employeList.add("King Naagarjuna");
        employeList.add("Rajat");
        employeList.add("Vasu");
        employeList.add("Abhilash");
        employeList.add("Vidya");
        employeList.add("siva");
        employeList.add("chandan");
        employeList.add("Dinesh");
        employeList.add("Dinesh");
        employeList.add("siva");
        employeList.add("siva");
        employeList.add("siva");
        employeList.add("Dinesh");
        employeList.add("Dinesh");

        int count = 0;
        List<Integer> duplicateCount = new ArrayList<>();
        List<String> duplicateName = new ArrayList<>();

        for (int i = 0; i < employeList.size(); i++) {

            for (int j = i + 1; j < employeList.size(); j++) {

                if (employeList.get(i).equalsIgnoreCase(employeList.get(j))) {
                   String str = employeList.get(i);
                    duplicateName.add(employeList.get(i));
                    duplicateCount.add(count++);
                    if (str.equalsIgnoreCase(employeList.get(i)) )
                        System.out.println( employeList.get(i));
                        break;



                    }
                }


            }
            System.out.println(duplicateName + " is duplicated " + duplicateCount + " times");
        }
    }









