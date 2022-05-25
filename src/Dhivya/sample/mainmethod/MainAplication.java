package Dhivya.sample.mainmethod;

import Dhivya.sample.collections.GamesList;
import Dhivya.sample.exceptionhandling.ArrayIndex;
import Dhivya.sample.exceptionhandling.DivyaException;
import Dhivya.sample.exceptionhandling.IndexOutOfBound;
import Dhivya.sample.impls.TaggedInterface;
import Dhivya.sample.singletone.SingletoneExample;
import sangamesh.exceptionhandling.mainexception;

import java.util.ArrayList;
import java.util.List;

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


       /* try {
            throw new DivyaException("Runtime Exception");
        }catch (DivyaException e){
            System.out.println("Catch");
            System.out.println(e.getMessage());
        }*/
//Array Index Out of Bound**************************************************
        /*ArrayIndex arrayIndex=new ArrayIndex();
        arrayIndex.getArray();*/

//list
        GamesList gamesList=new GamesList();

        GamesList gamesList1=new GamesList();
        gamesList1.setGamename("Throw Ball");
        gamesList1.setNo(1);
        GamesList gamesList2=new GamesList();
        gamesList2.setGamename("Kabbadi");
        gamesList2.setNo(2);
        GamesList gamesList3=new GamesList();
        gamesList3.setGamename("Volly Ball");
        gamesList3.setNo(3);
        List<GamesList>list=new ArrayList();
        list.add(gamesList1);
        list.add(gamesList2);
        list.add(gamesList3);
        for (GamesList ga: list) {

            System.out.println("game name " + ga.getGamename());
            System.out.println("game no " + ga.getNo());
            System.out.println("**************************************");


        }




    }
}
