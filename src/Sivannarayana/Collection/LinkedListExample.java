package Sivannarayana.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListExample {
    LinkedList<String> Hero = new LinkedList<>();
  public void toolywood(){
        Hero.add("venkatesh");
        Hero.add("nani");
        Hero.add("balakrishna");
      Collection<String> Heroine = new ArrayList<>();
      Heroine.add("kajal");
      Heroine.add("samantha");
      Heroine.add("sridevi");
      System.out.println("The LinkedList is: " + Hero);
      Heroine.addAll(Hero);
      System.out.println("The new linked list is: " + Heroine);
  }
}
