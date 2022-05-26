package Vamshi.sample.listexample;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    List<String> employee = new ArrayList<>();

    public void TestEmployeeList() {
        employee.add("vamshi");
        employee.add("rajat");
        employee.add("soheil");
        employee.add("junaid");
        employee.add("kalyan");
        employee.add("rajat");
        employee.add("mounika");
        employee.add("kalyan");
        // for (String str : employee) {

        int count = 0;
        for (int i = 0; i < employee.size(); i++) {
           // count++;
            if(employee.lastIndexOf(employee.get(i))!=i){
                System.out.println(employee.get(i)+count);

            }

        }











        // System.out.println(str);
    }


}



