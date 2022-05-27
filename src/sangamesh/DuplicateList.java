package sangamesh;

import java.util.ArrayList;
import java.util.List;

public class DuplicateList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("sangam");
        list.add("teja");
        list.add("chandan");
        list.add("bargav");
        list.add("teja");
        list.add("ramesh");
        int count = 0;
        String duplicatename = null;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).equalsIgnoreCase(list.get(j))) {

                    count++;
                    duplicatename=list.get(j);
                    break;
                }
            }
        }
            System.out.println(duplicatename);

    }
   }



