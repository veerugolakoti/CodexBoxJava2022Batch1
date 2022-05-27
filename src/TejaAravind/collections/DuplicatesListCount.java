package TejaAravind.collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesListCount {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("teja");
        list.add("kumar");
        list.add("teja");
        list.add("siva");
        list.add("siva");
        list.add("kumar");
        list.add("kumar");
        list.add("siva");
        list.add("teja");

        System.out.println(list);

        List<String> listString = new ArrayList<>();
        List<Integer> listCount = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))) {
                    if (listString.contains(list.get(i))) {
                        break;
                    } else {
                        listString.add(list.get(i));
                    }
                }
            }
            int j = i < list.size() - 1 ? i + 1 : list.size() - 1;
            for (; j < list.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))) {
                    count++;
                }
            }

            if (count > 0) {
                listCount.add(count);
            }
        }
//        System.out.println(listString);
//        System.out.println(listCount);


        for (int i = 0; i < listString.size(); i++) {
            int getCount = list.indexOf(listString.get(i));
            System.out.println("Duplicate Element : " + listString.get(i) + " is repeated for " + listCount.get(getCount) + " times");
        }

    }
}