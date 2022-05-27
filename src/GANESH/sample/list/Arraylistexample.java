package ganesh.sample.list;
import java.util.*;
public class Arraylistexample<S> {
    public void m1()
    {

       ArrayList<String> al1  = new ArrayList<>();
     al1.add("ganesh");
     al1.add("leela");
     al1.add("jaddu");
     al1.add("ram");
      al1.add("ganesh");
      al1.add("bhargav");
      al1.add("shiva");
      al1.add("chandan");
      al1.add("ganesh");


      /*  ArrayList<ArrayList<String>> al2  = new ArrayList();
        for (String arr1:al1) {
            if (!al2.contains(al1)) {
                al2.add(al1);
            }
        }
            for (ArrayList<String> arr2:al2) {
                System.out.println(arr2);
            }*/
        int count =0;
        ArrayList<String> al2  = new ArrayList<>();
        for (int i =0;i< al1.size();i++){
            for (int j=i+1;j< al1.size();j++){
               if (al1.get(i).equalsIgnoreCase(al1.get(j))){
                   System.out.println("duplicate name is" + al1.get(i));
                      count++;
                }
            }
        }


        }



    }







