package Swathi.SampleExample;

import java.util.ArrayList;
import java.util.List;


public class ArrayListAaa {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList();
        arrayList.add("geeks");
        arrayList.add("for");
        arrayList.add("geeks");
        arrayList.add("java");
        Integer duplicatecount=1;
        String duplicatename=null;
       // List<Integer> arraylist=new ArrayList<>();


        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i)==(arrayList.get(j)) ){

                    duplicatecount++;
                    duplicatename=arrayList.get(i);
                    break;

                }
            }
        }
        System.out.println(duplicatename +duplicatecount +"times");
    }
}