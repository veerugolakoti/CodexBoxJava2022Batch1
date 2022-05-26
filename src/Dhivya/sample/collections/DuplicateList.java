package Dhivya.sample.collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicateList {
    public void testlist() {
        List<String> foods = new ArrayList();
        foods.add(" Veg Biriyani");
        foods.add("Chicken Biriyani");
        foods.add("Chicken Rice");
        foods.add("Mutton Biriyani");
        foods.add("Chicken 65");
        foods.add("Sambar Rice");
        foods.add("Panner rice");
        foods.add("Gobi Rice");
        foods.add("Chicken 65");
        foods.add("Mushroom Biriyani");
        foods.add("pizza");
        foods.add("pizza");
        foods.add("Chicken 65");

        int count = 1;
        List<Integer>duplicatecount=new ArrayList();
        List<String>duplicateFoods=new ArrayList();
        //String str=null;

        for (int i = 0; i < foods.size(); i++) {


            for (int j = i + 1; j < foods.size(); j++) {
                if (foods.get(i).equalsIgnoreCase(foods.get(j))) {
                    if(foods.get(i).contains(foods.get(j))){

                        duplicateFoods.add(foods.get(i));
                       duplicatecount.add(count ++ );
                     break;



                }

            }}}
            System.out.println("duplicate foods " + duplicateFoods );
            System.out.println( " count " + duplicatecount);
        }
    }
