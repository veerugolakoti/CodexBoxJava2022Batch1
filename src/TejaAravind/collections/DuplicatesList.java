package TejaAravind.collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesList {
    public static void duplicates() {
        List<String> list = new ArrayList<>();

        list.add("saikumar");
        list.add("shiva");
        list.add("shiva");
        list.add("krishna");
        list.add("shiva");
        list.add("teja");
        list.add("shiva");
        list.add("shiva");



        int count = 1;
        String tempString = "";



        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))){
                    tempString = list.get(i);
                    count++;
                    break;
                }

            }

        }
        System.out.println("Duplicates are " +tempString +" repeated for " + count);


    }
}










