package Sohail.sample.JunitExample;

import org.junit.Assert;
import org.junit.Test;


public class Calculator {
    double a=10;
    double b=20;
    double sum;
   @Test

    public void m(){
        sum= a+b;
       Assert.assertEquals(30,sum,sum);

    }

}

