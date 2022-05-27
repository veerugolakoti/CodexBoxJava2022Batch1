package Sohail.sample.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {

    @Test
    public void arrayListExample(){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.set(2,25);
        System.out.println(list.get(0));
        System.out.println(list.contains(16));
        System.out.println(list.size());
        System.out.println(list.equals(17));
        System.out.println(list);


    }
}
