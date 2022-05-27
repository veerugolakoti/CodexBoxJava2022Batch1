package jhansi.duplicatevalues;

import java.util.ArrayList;
import java.util.List;

public class ListOfNames {

   public static void method() {

        List<String> arraylist = new ArrayList<>();
        arraylist.add("jhansi");
        arraylist.add("renuka");
        arraylist.add("swathi");
        arraylist.add("swathi");
        arraylist.add("akshi");
        arraylist.add("ravali");
        arraylist.add("vidya");
        arraylist.add("divya");
        arraylist.add("mouni");
        arraylist.add("divya");

        Integer duplicatecount = 1;
        String duplicatename = null;
        List <String> ls=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();

        for (int i = 0; i < arraylist.size(); i++) {
            for(int j=i+1;j< arraylist.size();j++){
               if(arraylist.get(i).equalsIgnoreCase(arraylist.get(j))) {

//                    System.out.println(arraylist.get(i));
                    duplicatecount++;

                    if (! ls.contains(arraylist.get(i))) {
                        System.out.println(arraylist.get(j) + " count is " + duplicatecount);
                        // System.out.println(duplicatename+ "is duplicated" + duplicatecount +"times");
                        break;
                    }
                 //break;
                }
            }
        }
     //  System.out.println("is duplicated" + duplicatecount +"times");

    }


    }