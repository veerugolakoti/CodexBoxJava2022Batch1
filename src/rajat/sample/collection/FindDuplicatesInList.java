package rajat.sample.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindDuplicatesInList {
    public void findDuplicates(){
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
        List<Integer> count = new ArrayList<>();
        List<String> temp= new ArrayList<>() ;
        Integer count1 =0;
        String str =null;
       /*  for (String str:student) {
             Integer count1 = 0;
             for (String str1:student) {
                 if (str.equalsIgnoreCase(str1)){
                     count1++;
                     if(count1>1) {
                         temp =str1;
                         count =count1;
//                         System.out.println(str1+"duplicate"+count1);
                     }
                 }
             }
         }
        System.out.println(temp+ " is Duplicate "+ count);
*/
     /*   String duplicate =null;
        int count = 0;
        for (String str:student) {
            if (Collections.frequency(student,str)>1){

                duplicate =str;
                count++;
            }
        }
        System.out.println(duplicate+" duplicate "+count);*/

        for(int i=0 ; i<student.size();i++){
            for (int j=i+1;j<student.size();j++){
                if (student.get(i).equalsIgnoreCase(student.get(j))){
                    count.add(count1++);
                    if (!temp.contains(student.get(i))) {
                        temp.add(student.get(i));
                    }
                    break;
                }
            }

        }System.out.println(temp+"Duplicate+"+count);
//        System.out.println(temp+"Duplicate:"+count+"times");
//        int num =1;
//        for (int k =0;k<temp.size();k++){
//                for (int l = k+1;l<temp.size();l++) {
//                    if (temp.get(k).equalsIgnoreCase(temp.get(l))) {
//                        num++;
//
//                    }
//                }

    }
//        System.out.println(num);
//        System.out.println(temp.get());

}

