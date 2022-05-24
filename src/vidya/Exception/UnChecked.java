package vidya.Exception;

import java.io.File;

public class UnChecked {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
       try {
           File file = new File(String.valueOf(a/b));
           String x = "a / b";

       }
       catch ( ArithmeticException e){
           System.out.println("a/b is infinite value");
       }
    }
}