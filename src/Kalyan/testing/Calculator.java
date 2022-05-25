package Kalyan.testing;
import org.junit.Assert;
import org.junit.Test;
public class Calculator {
    Example example=new Example();
    @Test
    public void testSum(){
        Assert.assertEquals (50,example.sum(20,30));
    }
}
