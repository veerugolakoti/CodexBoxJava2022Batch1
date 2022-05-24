package Dhivya.sample.mainmethod;

import Dhivya.sample.exceptionhandling.IndexOutOfBound;
import Dhivya.sample.impls.TaggedInterface;
import Dhivya.sample.singletone.SingletoneExample;

public class MainAplication {
    public static void main(String[] args) {
        /*Model1 model1 = new Model1();
        model1.setPrice(20000);
        model1.setMemory("32 GB");
        model1.setSize(12);
        System.out.println("model 1 price: " + model1.getPrice());
        System.out.println("model 1 memory: " + model1.getMemory());
        System.out.println("model 1 size: " + model1.getSize());
        System.out.println();
        Model2 model2 = new Model2();
        model2.setPrice(30000);
        model2.setMemory("64 GB");
        model2.setSize(24);
        System.out.println("model 2 price: " + model2.getPrice());
        System.out.println("model 2 memory: " + model2.getMemory());
        System.out.println("model 2 size: " + model2.getSize());*/

      //singletone
       /* SingletoneExample singletoneExample1=SingletoneExample.getInstance();
        SingletoneExample singletoneExample2=SingletoneExample.getInstance();
        System.out.println(singletoneExample1.hashCode());
        System.out.println(singletoneExample2.hashCode());*/

   // taggedinterface
       /* TaggedInterface taggedInterface1=new TaggedInterface();
        taggedInterface1.name="divya";
        System.out.println("actual name : " + taggedInterface1.name);
        TaggedInterface taggedInterface2 = new TaggedInterface();
        taggedInterface2.name="dhivya";
        System.out.println("other name : " + taggedInterface2.name);*/


        //Exceptionhadling
       /* IndexOutOfBound indexOutOfBound = new IndexOutOfBound();
        try {
            indexOutOfBound.clone();
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }*/



    }
}
