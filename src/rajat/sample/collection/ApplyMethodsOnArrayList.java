package rajat.sample.collection;

import java.util.ArrayList;
import java.util.List;

public class ApplyMethodsOnArrayList {
    public void tryingDifferentMethods(){
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(12);
        arrayList1.add(34);
        arrayList1.add(55);
        arrayList1.add(9);//
        arrayList1.add(22);
        arrayList1.add(12);


        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(12);
        arraylist.add(34);
        arraylist.add(55);
        arraylist.add(9);//
        arraylist.add(22);
        arraylist.add(12);
        arraylist.add(13);
        arraylist.add(16);
        arraylist.add(17);
        arraylist.add(18);
        arraylist.add(18);
        arraylist.add(16);
        arraylist.add(123);
        arraylist.add(120);

        System.out.println(arraylist);
        System.out.println(arraylist.contains(34));
        System.out.println(arraylist.size());
        System.out.println(arraylist.lastIndexOf(12));
        System.out.println(arraylist.remove(4));
        System.out.println(arraylist.indexOf(5));
        System.out.println(arraylist.subList(4,7));
        System.out.println(arraylist.getClass());
        System.out.println(arraylist.isEmpty());
        System.out.println(arraylist.hashCode());
        System.out.println(arraylist.set(9,900));
        System.out.println(arraylist.containsAll(arrayList1));
    }
}
