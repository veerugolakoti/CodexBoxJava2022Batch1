package Sohail.sample.JunitExample;

import org.junit.Assert;
import org.junit.Test;


public class Calculator {
    int a=20;
    int b=10;
    int sum;
   @Test

    public void m(){
        sum= a+b;
        Assert.assertEquals(30,sum);
    }

}

