package junaid.sampleproject.main;

import junaid.sampleproject.collections.ArrayListExamples;
import junaid.sampleproject.collections.Cars;
import junaid.sampleproject.collections.FindDuplicatesValues;
import junaid.sampleproject.taggedinterfaces.TaggedInterfaces;

import java.util.ArrayList;
import java.util.List;

public class MainApplication
{
    public static void main(String[] args)
    {
      /*  InterfacesImpl interfaces = new InterfacesImpl();
        interfaces.getInterfaces();
*/
        TaggedInterfaces taggedInterface = new TaggedInterfaces();
        taggedInterface.aFloat = 7.5f;
        System.out.println("My Float Value is: " + taggedInterface.aFloat);

        TaggedInterfaces interfaces1 = null;
        try {
        taggedInterface.display();

            TaggedInterfaces taggedInterfaces = new TaggedInterfaces();
        } catch (ArithmeticException e) {
            System.out.println("There is a Arithmetic Exception");
        }
//          try
//          {
//         InterfacesImpl interfaces2 = (InterfacesImpl) taggedInterface.getTaggedInterfaces();
//         System.out.println(interfaces2.hashCode());
//        }
//          catch (ClassCastException exception)
//        {
//            System.out.println("I am inside the ClassCastException....");
//        }
//          catch (CloneNotSupportedException e)
//         {
//             System.out.println("I am expected the CloneNotSupportedException..");
//         }
         taggedInterface.aFloat = 8.5f;
         System.out.println("My Second value is: " + taggedInterface.aFloat);

        System.out.println("=================Collections====================");

        List<Cars> list = new ArrayList<>();

        Cars cars = new Cars();

        cars.setCarName("Rolls Royes");
        cars.setModelNum(2022);
        cars.setColor("Black");
        cars.setEngineNum("AJ2022TH");
        cars.setSeatCapacity(6);

        Cars cars1 = new Cars();

        cars1.setCarName("BMW");
        cars1.setModelNum(2020);
        cars1.setColor("White");
        cars1.setEngineNum("JU208910NA39ID");
        cars1.setSeatCapacity(4);

        Cars cars2 = new Cars();

        cars2.setCarName("Audi");
        cars2.setModelNum(2019);
        cars2.setColor("Blue");
        cars2.setEngineNum("Di292AN893UJ");
        cars2.setSeatCapacity(2);

        list.add(cars);
        list.add(cars1);
        list.add(cars2);

        for (Cars cars3 : list) {
            System.out.println("My Car name is: " + cars3.getCarName());
            System.out.println("My Car Model is: " + cars3.getModelNum());
            System.out.println("My Car Color is: " + cars3.getColor());
            System.out.println("My Engine Number is: " + cars3.getEngineNum());
            System.out.println("My Car Sitting Capacity are: " + cars3.getSeatCapacity());
            System.out.println("==========================================================");

        }
//        System.out.println("========================Testing==========================");
//        System.out.println("================Find Duplicate Values====================");
//
//        FindDuplicatesValues findDuplicatesValues = new FindDuplicatesValues();
//
//        findDuplicatesValues.findDupValues();

        System.out.println("=================Find ArrayList Examples================");

        ArrayListExamples arrayListExamples = new ArrayListExamples();

        arrayListExamples.testMyArray();


    }
}
