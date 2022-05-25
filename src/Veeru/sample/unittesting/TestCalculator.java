package Veeru.sample.unittesting;

import Veeru.sample.calculations.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public   void testAddition() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(30, calculator.sum(10, 20));
    }

    @Test
    public   void testAdditionWithNegativeValues() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(-30, calculator.sum(-10, -20));
    }

}
