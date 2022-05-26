package TejaAravind.testingApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSum {
    @Test
    public void check1(){
        Assertions.assertEquals(6, operate(2,3));

    }

    int operate(int a, int b){
        return a+b-a%b/3*5/b-1+a;
    }
}
