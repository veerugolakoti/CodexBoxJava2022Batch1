package sasi.sample.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ArraylistExample {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("sai");
        arrayList.add("sravan");
        arrayList.add("killer");
        arrayList.add("sasi");
        arrayList.add("sasi");
        arrayList.add("pawan");
        arrayList.add("pawan");

        int count = 0;
        List<Integer> duplicateCount = new ArrayList<>();
        List<String> duplicateName = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {

            for (int j = i + 1; j < arrayList.size(); j++) {

                if (arrayList.get(i).equalsIgnoreCase(arrayList.get(j))) {
                    duplicateCount.add(count++);
                    duplicateName.add(arrayList.get(j));
                    break;
                }
            }
        }
        System.out.println(duplicateName + " is duplicated " + duplicateCount + " times");

    }
    }





//        int count = 0;
//        List<Integer> duplicateCount = new ArrayList<>();
//        List<String> duplicateName = new ArrayList<>();
//
//        for (int i = 0; i < arrayList.size(); i++) {
//
//            for (int j = i + 1; j < arrayList.size(); j++) {
//                if (arrayList.get(i).equalsIgnoreCase(arrayList.get(j))) {
//                    duplicateCount.add(count++);
//                    duplicateName.add(arrayList.get(j));
//                    break;
//                }
//            }
//        }System.out.println(duplicateName + "duplicate name :" + duplicateCount + "count times" );
//    }
//}


//        for (int i = 0; i < arrayList.size(); i++) {
//
//            for (int j= i + 1; j < arrayList.size(); j++) {
//
//                if (arrayList.get(i).equalsIgnoreCase(arrayList.get(j))) {
//                    duplicateCount.add(count ++);
//                    duplicateName.add(arrayList.get(j));
//                    break;
//                }
//            }
//        }

//        System.out.println(arrayList);
//        int DuplicateCount = 0;
//
//        for (int j = 0; j < arrayList.size(); j++) {
//            for (int k = j + 1; k < arrayList.size(); k++) {
//                if ((arrayList.get(j).equals(arrayList.get(k))) && (j != 'k')) {
//                    System.out.println(arrayList.get(j));
//                    int[] String = new int[0];
//                    String[j]=0;
//                    DuplicateCount++;
//                }
//
//            }
//        }


//        Set<String> set=new HashSet<String>();
//
//        boolean flag=true;
//        int counter=0;
//        for(int i=0;i<arrayList.size();i++){
//            flag=.arrayList(arrayList.get(i));
//            if(!(flag)){
//                System.out.println("Duplicate value in list is = " + arrayList.get(i));
//                flag=true;
//                counter++;
//            }
//        }
////        System.out.println(count);
//    }