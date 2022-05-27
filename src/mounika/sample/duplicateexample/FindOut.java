package mounika.sample.duplicateexample;

import java.util.ArrayList;
import java.util.List;

public class FindOut {
    public void pratice() {
        List<String> list = new ArrayList();

        list.add("realme");
        list.add("oppo");
        list.add("redme");
        list.add("redme");
        list.add("nokia");
        list.add("oppo");
        list.add("redme");
        list.add("nodeoneplus");

//        List<String>duplist=new ArrayList();
//        List<Integer>dupcount=new ArrayList();
//
//          int count=0;
//        for (int i=0;i< list.size();i++){
//            for(int j=i+1;j< list.size();j++){
//                if(list.get(i).equalsIgnoreCase(list.get(j))){
//                    dupcount.add(count++);
//                    duplist.add(list.get(i));
//
//                }
//            }
//            System.out.println(count);
//
//        }



       //Integer count = 1;

        List<String> duplist=new ArrayList();
        List<Integer>dupcount=new ArrayList();

        Integer count = 0;
        String str=null;
        //for (String str : list) {
        for (int i = 0; i < list.size() ; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))) {
                    dupcount.add(count++);
                    duplist.add(list.get(j));
              break;
                }
            }


        }System.out.println("duplicate element : " + count );
        System.out.println("duplicate name is "+ duplist);
    }


    }









