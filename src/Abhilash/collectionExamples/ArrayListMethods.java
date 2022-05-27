package Abhilash.collectionExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListMethods {
    public void arrayListMethods() {
        Scanner sc = new Scanner(System.in);
           List<Integer> integerList = new ArrayList<>();
       for(Integer i = 0; i<integerList.size(); i++){
        integerList.add(sc.nextInt());}
        integerList.add(1);
        integerList.add(2);
        integerList.add(54);
        System.out.println(integerList.get(1));
    }
}
