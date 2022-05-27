package Kalyan.testing;
import Kalyan.List.ArrayListExample;
import org.junit.Assert;
import org.junit.Test;

public class Calculator {

    Example example = new Example();

    @Test
    public void testSum() {
        Assert.assertEquals(50, example.sum(20, 30));
        System.out.println("testing values");
    }

    @Test
    public void testnegative() {
        Assert.assertEquals(-70, example.sum(-40, -30));
    }

    @Test
   public void linkedlist() {
        ArrayListExample listExample=new ArrayListExample();
        listExample.linkedlist();
    }
}



