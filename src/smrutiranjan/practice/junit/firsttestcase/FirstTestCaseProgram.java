package smrutiranjan.practice.junit.firsttestcase;

import org.junit.Assert;
import org.junit.Test;
import smrutiranjan.practice.empdetails.EmpDetails;

public class FirstTestCaseProgram {

    public static int add(int a, int b) {
        return a + b;
    }

    @Test
    public void test() {
        Assert.assertEquals(10, FirstTestCaseProgram.add(5, 5));
    }
  /*  @Test                     //initialization error
    public void test2(){
        CalcProgram cp = new CalcProgram();
        Assert.assertEquals(10,cp.calc(12,23));
    }
*/
}
