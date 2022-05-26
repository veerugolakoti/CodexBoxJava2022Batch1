package chandan.uncheckedexception;

import java.util.ArrayList;
import java.util.List;

public class Duplicateelements {
    public void testMyArrayList() {
        List<String> employeeList = new ArrayList();
        employeeList.add("Bhargav");
        employeeList.add("Ram");
        employeeList.add("Kalyan");
        employeeList.add("Swath");
        employeeList.add("Junaid");
        employeeList.add("Sohail");
        employeeList.add("Ravali");
        employeeList.add("vamshi");
        employeeList.add("Rehana");
        employeeList.add("Khammam");
        employeeList.add("JAVA Jhansi");
        employeeList.add("Dhivya chennai");
        employeeList.add("Mounika");
        employeeList.add("Jai Leela Ganesh");
        employeeList.add("Single Sashi");
        employeeList.add("Harsha Bhogle");
        employeeList.add("King Naagarjuna");
        employeeList.add("Rajat");
        employeeList.add("Vasu");
        employeeList.add("Abhilash");
        employeeList.add("Vidya");
        employeeList.add("siva");
        employeeList.add("chandan");
        employeeList.add("Dinesh");
        employeeList.add("Dinesh");
        employeeList.add("siva");
        employeeList.add("siva");
        employeeList.add("siva");
        employeeList.add("Dinesh");
        //employeeList.add("Dinesh");

        int count = 0;
        List<Integer> duplicateCount =  new ArrayList<>();
        List<String> duplicateName = new ArrayList<>();

        for (int i = 0; i < employeeList.size(); i++) {

            for (int j= i + 1; j < employeeList.size(); j++) {

                if (employeeList.get(i).equalsIgnoreCase(employeeList.get(j))) {
                    count++;
                    if(duplicateName.contains(employeeList.get(i))) {

                        break;
                    } else {

                        duplicateName.add(employeeList.get(i));
                        duplicateCount.add(count);
                    }
                }
            }
        }
        System.out.println(duplicateName + " is duplicated " + duplicateCount + " times");
    }

}
