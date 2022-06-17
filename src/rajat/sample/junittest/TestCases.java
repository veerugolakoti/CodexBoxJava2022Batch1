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
    public float getAdd(float a,float b){
        return a+b;
    }
    @Test
    public void addition(){
        Assert.assertEquals(98.7,getAdd(34.3f,65.4f));
    }
}
