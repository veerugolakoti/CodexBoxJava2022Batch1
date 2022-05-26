package Dinesh202270.unitTesting;

import Dinesh202270.Dublicate.Dublicate;
import junit.framework.Assert;
import org.junit.Test;

import java.lang.annotation.Repeatable;

public class Testing1 {

    @Test

    public void checking()
    {
        Dublicate d=new Dublicate();
     org.junit.Assert.assertEquals(8, d.numbers(4,4));
        Assert.assertEquals(9, d.numbers(4,5));
        Assert.assertEquals(80, d.numbers(40,40));

        Assert.assertEquals(80, d.numbers(40,40));
    }
    @Test
    public void checking1()
    {
        Dublicate e = new Dublicate();
        Assert.assertEquals(9, e.numbers(4,5));
    }
}
