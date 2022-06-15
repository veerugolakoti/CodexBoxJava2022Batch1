package harshadeepthi;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public void testarraylist() {
        List<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Harsha");
        list.add("Ajay");
        list.add("Ramesh");
        list.add("Harsha");
        list.add("Ranjan");
        list.add("shiva");
        list.add("Keerthi");
        list.add("Keerthi");

        int count = 0;
        int i;
        for (i = 0; i < list.size(); i++) {
            if (list.indexOf(list.get(i)) != i) {
                count++;


            }

        }
        System.out.println(list.get(i) + " is duplicate name  " + "   repeated name " + count);
    }
}

