package ramdurgaprasad.sample.collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicateStringWithCount {
    public void Duplicate() {
        List<String> collegues = new ArrayList();
        collegues.add("ram");
        collegues.add("durga");
        collegues.add("prasad");
        collegues.add("ram");
        collegues.add("prasad");
        collegues.add("exit");
        collegues.add("prasad");
        collegues.add("codex");
        collegues.add("finished");
        collegues.add("javaa");
        collegues.add("ram");
        collegues.add("vijay");
        collegues.add("t3eja");
        collegues.add("sai");
        int count1=0;
//        String[]  str1= (String[]) collegues.parallelStream() .toArray();
        List<Integer> count = new ArrayList<>();
        List<String> name = new ArrayList<>();
//        List<String>name1 = new ArrayList<>();
        for (int i = 0; i < collegues.size(); i++) {
//            String str=str1[i];
//            if(name.contains())
            for (int j = i + 1; j < collegues.size(); j++) {
                if (collegues.get(i)==collegues.get(j)) {
//                    count.add(count1++);
                   name.add(collegues.get(j));
//                   name.add(c
                    break;
                }
            }
        } System.out.println("the duplicate name is:"+ name + " ,and the number of times repeated:");

    }
}