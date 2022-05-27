package rajat.sample.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicatesInList {
    public void findDuplicates() {
        List<String> student = new ArrayList<>();
        student.add("Rajat");
        student.add("Junu");
        student.add("Swati");
        student.add("Kalu");
        student.add("Divya");
        student.add("Junu");
        student.add("Ganesh");
        student.add("Kalu");
        student.add("Junu");
        student.add("Abhilash");
        student.add("Junu");
        student.add("Rajat");
        student.add("vamshi");
/*        Integer count1 =0;
        String temp=null;
         for (String str:student) {
             Integer count2 = 0;
             for (String str1:student) {
                 if (str.equalsIgnoreCase(str1)){
                     count2++;
                     if(count2>1) {
                         temp =str1;
                         count1 =count2;
                     }
                 }
             }
         }
        System.out.println(temp+ " is Duplicate "+ count1);*/
     /*   String duplicate =null;
        int count = 0;
        for (String str:student) {
            if (Collections.frequency(student,str)>1){

                duplicate =str;
                count++;
            }
        }
        System.out.println(duplicate+" duplicate "+count);*/


      /*  int count1 = 0;
        String temp= null;
        for(int i=0 ; i<student.size();i++){
            for (int j=i+1;j<student.size();j++){
                if (student.get(i).equalsIgnoreCase(student.get(j))){
                    count1++;
                    temp=student.get(i);
                    break;
                }
            }

        }System.out.println(temp+"Duplicate+"+count1);*/

        Collections.sort(student);
        for (int k = 0; k < student.size(); k++) {
            int count = 1;
            for (int l = k + 1; l < student.size(); l++) {
                if (student.get(k).equalsIgnoreCase(student.get(l))) {
                   count++;
                } else {
                    break;
                }
            }
            if (count > 1) {
                System.out.println(student.get(k) + " Duplicate " + count+ " times");
                k = k + (count - 1);
            }

        }

    }
}

