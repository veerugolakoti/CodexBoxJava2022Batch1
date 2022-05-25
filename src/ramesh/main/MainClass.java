package ramesh.main;

import org.junit.Assert;
import org.junit.Test;
import ramesh.junit.Junitexamples;

public class MainClass {
    @Test
  public   void calculate(){
        Junitexamples junitexamples = new Junitexamples();
        Assert.assertEquals(50,junitexamples.multiplication(10,2));
    }

}
