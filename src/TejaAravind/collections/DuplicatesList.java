package TejaAravind.collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesList {
    public static void Duplicates() {
        List<String> list = new ArrayList<>();
        list.add("shiva");
        list.add("shiva");
        list.add("saikumar");
        list.add("shiva");
        list.add("shiva");
        list.add("krishna");
        list.add("teja");
        list.add("shiva");



        int count = 0;
        String tempString = "";



        for (int i = 0; i < list.size(); i++) {
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










