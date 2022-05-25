package junaid.sampleproject;

import org.junit.Assert;
import org.junit.Test;
import rajat.sample.exceptionhandeling.ArithmeticExceptionClass;

public class Calculator
{
   public int getSum(int a, int b)
   {
       return a + b;
   }
   @Test
    public void testAddition()
   {
       Calculator calculator = new Calculator();
       Assert.assertEquals(30,calculator.getSum(14,16));
   }
}
