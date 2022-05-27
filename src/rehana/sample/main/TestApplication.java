package rehana.sample.main;

import org.testng.annotations.Test;
import rehana.sample.collectionsExample.ArraylistExample2;


public class TestApplication {
    @Test
    public void TestApplication() {
        ArraylistExample2 arraylistExample2 = new  ArraylistExample2();
        arraylistExample2.print();
    }
}