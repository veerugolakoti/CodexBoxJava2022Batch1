package sangamesh.duplicateexample;

import java.util.ArrayList;
import java.util.List;

public class DuplicateList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("sangam");
        list.add("teja");
        list.add("chandan");
        list.add("ramesh");
        list.add("Bargav");
        list.add("ramesh");
        list.add("ramesh");

        int count = 1;
        String duplicatename = null;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).equalsIgnoreCase(list.get(j))) {
                    count++;
                    duplicatename=list.get(j);
                }
            }
        }
        System.out.print("duplicate name is " +duplicatename );
        System.out.println(". name repeated by "  +count + "times"  );

    }
   }



