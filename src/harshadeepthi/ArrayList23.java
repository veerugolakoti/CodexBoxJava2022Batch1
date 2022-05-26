package harshadeepthi;

import java.util.List;
import java.util.ArrayList;

public class ArrayList23 {
    public void testMyarraylist() {
        List<String> studentList =new java.util.ArrayList<>();
        studentList.add("ravi");
        studentList.add("sai");
        studentList.add("arun");
        studentList.add("Ramu");
        studentList.add("sirisha");
        studentList.add("amrutha");
        studentList.add("Shankar");
        studentList.add("Harsha");
        studentList.add("saikeerthi");
        studentList.add("saikeerthi");
        studentList.add("Harsha");


        int count = 0;
        List<Integer> duplicateCount =  new ArrayList<>();
        List<String> duplicateName = new ArrayList<>();

        for (int i = 0; i < studentList.size(); i++) {

            for (int j= i + 1; j < studentList.size(); j++) {

                if (studentList.get(i).equalsIgnoreCase(studentList.get(j))) {
                    duplicateCount.add(count ++);
                    duplicateName .add(studentList.get(j));
                    break;
                }
            }
        }


        System.out.println(duplicateName + " is duplicated " + duplicateCount + " times");
    }
}