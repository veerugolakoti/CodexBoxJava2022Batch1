package Shiva.JunitTesting;

import org.junit.Assert;
import org.junit.Test;

public class JunitExample {


    public static int multiplication(int a, int b) {
        return a * b;
    }
    @Test
    public void compareMul() {
        Assert.assertEquals(100, JunitExample.multiplication(10, 10));
    }
}
