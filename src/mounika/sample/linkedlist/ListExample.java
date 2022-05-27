package mounika.sample.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public void listofexample(){


        List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("cd");
        list.add("rf");
        list.add("hj");

        list.size();

        System.out.println(list.size());
        list.add(3,"hj");
        list.remove(2);
    }
}