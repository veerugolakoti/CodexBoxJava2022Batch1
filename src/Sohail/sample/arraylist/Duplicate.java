package Sohail.sample.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

    public void m() {
        List<String> list = new ArrayList();
        list.add("Rajat");
        list.add("Vamsi");
        list.add("Vamsi");
        list.add("Junaid");
        list.add("Sohail");
        list.add("Sohail");
        list.add("Junaid");

        list.size();
        List<String> duplicateName = new ArrayList();
        List<Integer> duplicateCount= new ArrayList<>();
        Integer count=1;
        String str= null;

        for (int i=0;i< list.size();i++){
            for (int j=i+1;j< list.size();j++){
                if(list.get(i).equalsIgnoreCase(list.get(j))){
                    duplicateCount.add(count++);
                    duplicateName.add(list.get(j));
                    break;
                }
            }
        }
        System.out.println("The  Duplicates is : " +duplicateName );
        System.out.println(" and repeated : "+duplicateCount);
    }
}











