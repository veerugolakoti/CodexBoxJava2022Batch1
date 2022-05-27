package mounika.sample.junitexample;

import mounika.sample.linkedlist.ListExample;
import mounika.sample.testing.Addition;
import org.junit.Assert;
import org.junit.Test;

public class Class {
    @Test
    public void written(){
        Addition addition=new Addition();
        Assert.assertEquals(40,addition.sum(0,40));
        ListExample listExample=new ListExample();
    }

}
