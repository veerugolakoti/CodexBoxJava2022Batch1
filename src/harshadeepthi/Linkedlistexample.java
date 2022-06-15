package harshadeepthi;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistexample {
           public void testMyLinkedlist(){

              List<String> list=new LinkedList<>();
              list.add("samyu");
              list.add("eghg");
              list.add("rhgg");//2
              list.add("ohggh");
              list.add("pjhhj");
              list.add("yjhg");
               System.out.println(list);
               System.out.println(list.indexOf("eghg"));
               list.size();
               list.set(3,"f");
               System.out.println(list.size());

               System.out.println(list.contains("samyu"));
               System.out.println(list.set(3,"fhgfh"));





           }
}
