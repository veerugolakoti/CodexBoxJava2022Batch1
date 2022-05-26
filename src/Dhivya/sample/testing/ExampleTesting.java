package Dhivya.sample.testing;

import Dhivya.sample.addition.Sum;
import org.junit.Assert;
import org.junit.Test;

public class ExampleTesting {
    @Test

    public void test(){
        Sum sum=new Sum();


        Assert.assertEquals(40,sum.sum(10,30));
    }




}
