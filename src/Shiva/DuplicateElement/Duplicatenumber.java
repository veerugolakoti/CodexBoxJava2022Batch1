package Shiva.DuplicateElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duplicatenumber {
    public void duplicateNumber() {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(15);
        list.add(13);
        list.add(17);
        list.add(18);
        list.add(13);

        int duplicate = 0;
        int count = 0;
        for (int li :list) {
            if(Collections.frequency(list, li) > 1) {
                duplicate = li;
                count++;
            }
        }
        System.out.println(duplicate + " is repeated " + count + " times");
    }
}
