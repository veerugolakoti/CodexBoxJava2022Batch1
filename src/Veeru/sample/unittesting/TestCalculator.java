package Veeru.sample.unittesting;

import Veeru.sample.calculations.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCalculator {
    @Test
    public   void testAddition() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(30, calculator.sum(10, 20));
    }

    @Test
    public   void testAdditionWithNegativeValues() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-30, calculator.sum(-10, -20));
    }

}
