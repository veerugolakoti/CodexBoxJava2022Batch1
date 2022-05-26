package sasi.sample.junit;


import org.junit.Assert;
import org.junit.Test;
import sasi.sample.junit.UnitTesting;

public class Mainclass {
    @Test
   public void testmethod (){
        UnitTesting u = new UnitTesting() ;
        Assert.assertEquals(2,u.div(40,20));
        }
    }
