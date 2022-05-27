package rehana.sample.collectionsExample;

//import java.util.ArrayList;
import java.util.*;

public class ArraylistExample2 {
    public  void print(){
        List<Integer>values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.remove(3);
        System.out.println(values);
    }
}
