package Sivannarayana.Collection;


public class ArrayList {
     java.util.ArrayList<String> names = new java.util.ArrayList<String>();
     public void Duplicateelements() {
         names.add("teja");
         names.add("ramesh");
         names.add("teja");
         names.add("siva");
         names.add("teja");
         names.add("teja");
         int count = 1;
         String name = " ";
         for (int i = 0; i < names.size(); ++i) {
             for (int j = i + 1; j < names.size(); ++i) {
                 if (names.get(i).equals(names.get(j))) {
                 count++;
                     name = names.get(i);
                   break;

                 }
             }
         }
         System.out.println(count+ " "+ names );
     }
 }


