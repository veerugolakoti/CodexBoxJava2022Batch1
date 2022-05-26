package junaid.sampleproject;

import org.junit.Assert;
import org.junit.Test;

public class Calculator
{
   public float getSum(float a, float b)
   {
       return a + b;
   }
   @Test
    public void testAddition()
   {
       Calculator calculator = new Calculator();
       Assert.assertEquals(11.0f, calculator.getSum(4.5f, 6.5f), 0.00001);
   }
}
