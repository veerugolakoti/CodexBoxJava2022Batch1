package vidya.frameworks;

import junit.framework.Assert;
import org.junit.Test;

public class UnitExample {
    @Test
    public void checking() {
        JUnitexample jUnitexample = new JUnitexample();
        Assert.assertEquals(32,jUnitexample.JUnitexample(10,12));
        Assert.assertEquals(22,jUnitexample.JUnitexample(10,12));
        }
    }