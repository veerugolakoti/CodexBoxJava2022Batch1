package junaid.sampleproject.collections;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesValues {
    public void findDupValues() {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Junaid");
        arrayList.add("Ajaz");
        arrayList.add("Fayaz");
        arrayList.add("Mansoor");
        arrayList.add("Sohail");
        arrayList.add("Rojoot");
        arrayList.add("Sohail");
        arrayList.add("Abhilash");
        arrayList.add("Sohail");
        System.out.println(arrayList.size());

        int count = 0;
        String str2 = null ;
        for (String str : arrayList) {
            int num = 0;
            for (String str1 : arrayList) {
                if (str.equalsIgnoreCase(str1)) {
                   num++;
                    if (num > 1) {
                        str2 = str1;
                        count = num;

                    }
                }
            }
        }
        System.out.println("Duplicates values are: " + str2 + " " +  count + " times");
    }
}
