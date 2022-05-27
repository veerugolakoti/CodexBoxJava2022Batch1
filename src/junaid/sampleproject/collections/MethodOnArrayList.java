package junaid.sampleproject.collections;

import java.util.ArrayList;
import java.util.List;

public class MethodOnArrayList
{
    public void tryUsingDifferentMethods()
    {
        List<Float> floatList = new ArrayList<>();
        floatList.add(1.2f);
        floatList.add(2.4f);
        floatList.add(4.6f);
        floatList.add(6.8f);
        floatList.add(8.10f);
        floatList.add(10.2f);

        System.out.println(floatList.size());  // It will get the size of an ArrayList
        System.out.println(floatList.get(2));  // It will get the particular index value
        System.out.println(floatList.isEmpty());  // It will check the value are present are not in floatList


        List<Float> floatList1 = new ArrayList<>();
        floatList1.add(1.2f);
        floatList1.add(2.4f);
        floatList1.add(4.6f);
        floatList1.add(6.8f);



        System.out.println(floatList1.containsAll(floatList)); // It will search all the value either it will present in floatList are not
        System.out.println(floatList1.listIterator(13));

    }
}
