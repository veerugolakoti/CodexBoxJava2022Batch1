package rehana.sample.collectionsExample;

import rehana.sample.cloneabale.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
    public void test() {
        ArrayList<String> ArraylistExample = new ArrayList();
        ArraylistExample.add("rehana");
        ArraylistExample.add("arha");
        ArraylistExample.add("samreen");
        ArraylistExample.add("shaheen");
        ArraylistExample.add("samreen");
        ArraylistExample.add("samreen");
        ArraylistExample.add("vjhan");
        ArraylistExample.add("salma");
        ArraylistExample.add("salma");
        ArraylistExample.add("zabi");

        Integer Duplicatecount = 1;
        String Duplicatename = null;
        List<Integer> lst=new ArrayList<>();

        ArrayList<Integer> Duplicate = new ArrayList<>();

        for (int i = 0; i < ArraylistExample.size(); i++) {
            for (int j = i + 1; j < ArraylistExample.size(); j++) {
                if (ArraylistExample.get(i).equalsIgnoreCase(ArraylistExample.get(j))) {
                    System.out.println(ArraylistExample.get(i));
                    Duplicatecount++;
                    Duplicatename= ArraylistExample.get(j);
                    break;
                }
            }
        }
        System.out.println(Duplicatename+ " is duplicate " + Duplicatecount + " times");
    }
}

