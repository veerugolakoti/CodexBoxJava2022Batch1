package harshadeepthi.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaCollections {
   public static void main(String[] args){

        List<String> list=new ArrayList();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Harsha");
        list.add("Ajay");

        Iterator i=list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }


}
