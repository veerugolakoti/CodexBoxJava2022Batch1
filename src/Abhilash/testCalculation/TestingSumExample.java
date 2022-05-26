package Abhilash.testCalculation;

import Abhilash.Calculation.SumExample;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingSumExample {
    @Test
    public void testSum() {
        SumExample sum = new SumExample();
        sum.sum(1,2);
       Assert.assertEquals(3,3);
    }



}
