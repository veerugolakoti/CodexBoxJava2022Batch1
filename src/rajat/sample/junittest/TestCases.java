package rajat.sample.junittest;

import org.junit.Assert;
import org.junit.Test;
import rajat.sample.operators.arrithematic.ArithematicOperationApplication;

public class TestCases {
    @Test
    public void getSum(){
        ArithematicOperationApplication application = new ArithematicOperationApplication();
        Assert.assertEquals(52, application.sum(12,30));

    }
}
