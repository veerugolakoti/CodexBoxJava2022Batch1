package ramesh.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {
    public void linkedListOperations(){
        List<String> employe = new LinkedList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedList integers = new LinkedList();
        employe.add("sasi");
        employe.add("sivannarayana");
        employe.add("suresh");
        employe.add("codexbox");
        integers.add(250000);
        integers.add(450000);
        employe.size();
        integers.add(260000);
        integers.add(350000);
        employe.contains(4);
        linkedList.addAll(employe);
        employe.set(3,"siva");
        employe.size();
        integers.size();

        System.out.println("Elements in linked list :"+linkedList);
        System.out.println("Elements in employe variable : "+employe+" salary is :"+integers);
        System.out.println(employe.contains("sasi"));
        System.out.println(employe.size());
        System.out.println(employe.contains(4));


    }
}
