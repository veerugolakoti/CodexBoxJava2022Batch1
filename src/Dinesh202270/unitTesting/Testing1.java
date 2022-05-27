package Dinesh202270.unitTesting;

import Dinesh202270.duplicate.DuplicateStringsExample;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Testing1 {



   /* public void checking()
    {
        Dublicate d=new Dublicate();
     org.junit.Assert.assertEquals(8, d.numbers(4,4));
        Assert.assertEquals(9, d.numbers(4,5));
        Assert.assertEquals(80, d.numbers(40,40));

        Assert.assertEquals(80, d.numbers(40,40));
    }
    @Test
    public void checking1()
    {
        Dublicate e = new Dublicate();
        Assert.assertEquals(9, e.numbers(4,5));
    }*/

    @Test
    void testFindDuplicates() {

        List<String> employeeList = new ArrayList();
        employeeList.add("Bhargav");
        employeeList.add("Ram");
        employeeList.add("Kalyan");
        employeeList.add("Swath");
        employeeList.add("Junaid");
        employeeList.add("Junaid");
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
        employeeList.add("Junaid");
        employeeList.add("vidya");

        DuplicateStringsExample example = new DuplicateStringsExample();
        example.findDuplicates(employeeList);

    }



}
