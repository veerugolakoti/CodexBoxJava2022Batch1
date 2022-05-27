package Kalyan.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample {
  public void linkedlist(){
        List<String> list1 =new ArrayList();
        list1.add("orange");
        list1.add("apple");
        list1.add("bananna");
        list1.add("mango");
        list1.add("grapes");
        list1.add("cherry");

      List<String> list2 =new ArrayList();
      list2.add("apple");
      list2.add("orange");
      list2.add("bananna");
      list2.add("mango");
      list2.add("grapes");
      list2.add("cherry");

        /*list1.set(3,"kiwi");
        list1.add(4,"carrot");
        list1.remove(5);
        list1.clear();*/
       System.out.println(list1.containsAll(list2));

      list2.addAll(list1);

      System.out.println(list1);
      System.out.println(list2);
    }
}
