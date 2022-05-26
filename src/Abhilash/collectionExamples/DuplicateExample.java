package Abhilash.collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class DuplicateExample {
    public void duplicate() {
        List<String> list = new ArrayList<>();
        list.add("Abhilash");
        list.add("Junaid");
        list.add("vidya");
        list.add("rajat");
        list.add("ravali");
        list.add("renuka");
        list.add("rajat");
        list.add("vidya");
        list.add("vidya");
        list.add("rajat");

        int count1 = 1;
        List<Integer> listCount = new ArrayList<>();
        List<String> duplicateName = new ArrayList<>();
        System.out.println(list.size());
        for(int i = 0; i < list.size();i++){
            for(int j = i+1; j < list.size(); j++) {
                 if(list.get(i).equalsIgnoreCase(list.get(j))) {
                      if( !duplicateName.contains(list.get(i))) {
                              duplicateName.add(list.get(i));
                          }
                     count1++;
                     listCount.add(count1);
                       break;
                      }
            }
        }
        System.out.println("duplicate name is : "+ duplicateName+"\n" + listCount);


//        int count = 0;
//
//        for(int i=0; i<list.size();i++) {
//            int j= i+1;
//            if(list.get(i).contains()){
//                count ++;
//                if(count >1){
//                    System.out.println(list.get(i));
//                }
//            }
//        }
       }
}
