package Swathi.SampleExample;

import java.util.ArrayList;
import java.util.List;


public class ArrayListAaa {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList();
        arrayList.add("geeks");
        arrayList.add("for");
        arrayList.add("for");
        arrayList.add("geeks");
        arrayList.add("java");
        Integer duplicatecount=1;
        String duplicatename="swathi";
       List<Integer> method=new ArrayList<>();
       List<String>Method=new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i)==(arrayList.get(j)) ){
                    System.out.println(arrayList.get(i));
                    duplicatecount++;
                if(! Method.contains(arrayList.get(i)));
                    System.out.println();

                }
            }

                System.out.println(arrayList.get(i)+duplicatecount);

            break;
            }
        }



    }
