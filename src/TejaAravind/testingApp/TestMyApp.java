package TejaAravind.testingApp;

import TejaAravind.collections.DuplicatesListCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMyApp {
    @Test
    public void check1(){
        Assertions.assertEquals(6, operate(2,3));
    }

    int operate(int a, int b){
        return a+b-a%b/3*5/b-1+a;
    }

    @Test
    void testDuplicateElements() {
       // DuplicatesListCount duplicateExample = new DuplicatesListCount();
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
        employeeList.add("Dinesh");
        employeeList.add("Vidya");
        employeeList.add("Vidya");


        DuplicatesListCount.duplicateCount(employeeList);
    }
}
