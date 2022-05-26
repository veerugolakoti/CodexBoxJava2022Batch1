package TejaAravind.collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesList {
    public static void Duplicates() {
        List<String> list = new ArrayList<>();
        list.add("saikumar");
        list.add("krishna");
        list.add("teja");
        list.add("shiva");
        list.add("sai");
        list.add("shiva");
        list.add("kumar");
        list.add("shiva");
        list.add("sai");
        list.add("kumar");
        list.add("sai");
        list.add("kumar");


//        int count = 1;
//        String tempString = "";
//        int repeat = 0;

//
//        for (int i = 0; i < list.size(); i++) {
//          if (count != list.size() && list.get(i).equalsIgnoreCase(list.get(count++))){
//              tempString = list.get(i);
//              repeat++;
//          }
//        }
//        System.out.println(repeat + tempString);


        List<Integer> listCount = new ArrayList<>();
        List<String> listString = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))) {
//                    listCount.add(count ++);
                    listString.add(list.get(j));



                }
            }

        }

        for (int i = 0; i < listString.size(); i++) {
            int count1 = 0;
            for (int j = i + 1; j < listString.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))) {
                    count1++;



                }


            }
            if(count1 > 0){
                listCount.add(count1);
            }

        }



        System.out.println(listString );
        System.out.println( listCount);
    }
}










