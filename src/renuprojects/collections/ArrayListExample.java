package renuprojects.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public void usingArrayListMethods(){
        List<String> nameslist=new ArrayList<>();
        nameslist.add("pen");
        nameslist.add("book");
        nameslist.add("pencil");
        nameslist.add("bag");
        nameslist.add("cell");


        nameslist.remove(4);
        nameslist.add(1,"paper");
        System.out.println(nameslist.lastIndexOf("pen"));
        System.out.println(nameslist);
        List<String> anothernameslist=new LinkedList<>();
        anothernameslist.addAll(0,nameslist);
        System.out.println(anothernameslist);

    }
}
