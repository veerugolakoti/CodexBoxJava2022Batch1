package Dhivya.sample.collections;

import java.util.ArrayList;
import java.util.List;

public class DifferentMethodsOfArraylist {
   public void  methodsofarraylist(){
        List<String>mylist=new ArrayList<>();
        mylist.add("dhivya");
        mylist.add("mounika");
        mylist.add("dinesh");
        mylist.add("sohail");
        mylist.add("junaid");

       System.out.println(mylist.size());
       mylist.add(3,"swathi");
       mylist.remove(3);
       mylist.add(3,"vidya");
       System.out.println(mylist);

    }


}
