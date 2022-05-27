package junaid.sampleproject.collections;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class ArrayListExamples
{
    public void testMyArray()
    {
        List<String> employeeList = new ArrayList<>();
        employeeList.add("Bhargav");
        employeeList.add("Swath");
        employeeList.add("Junaid");
        employeeList.add("Junaid");
        employeeList.add("Rajat");
        employeeList.add("Vasu");
        employeeList.add("Dinesh");
        employeeList.add("Dinesh");
        employeeList.add("siva");
        employeeList.add("siva");
        employeeList.add("siva");
        employeeList.add("Dinesh");
        employeeList.add("Dinesh");
        employeeList.add("Junaid");


//        List<Integer> integerListCount = new ArrayList<>();
//        List<String> stringListName = new ArrayList<>();
//
//        int count = 0;
        for (int i = 0; i < employeeList.size(); i++)
        {
            int count1 = 1;
            for (int j = i + 1; j < employeeList.size(); j++)
            {
                if (employeeList.get(i).equalsIgnoreCase(employeeList.get(j)))
                {
//                    integerListCount.add(count++);
//                    stringListName.add(employeeList.get(j));
                    count1++;
                }else
                {
                    break;
                }
                if (count1 > 1) {
                    System.out.println(employeeList.get(i) + " is duplicated " + count1 + " times");
                    j = j + (count1 - 1);
                }
            }
        }
    }
}
