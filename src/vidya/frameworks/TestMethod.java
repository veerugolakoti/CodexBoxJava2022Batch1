package vidya.frameworks;

import javax.xml.soap.Name;
import java.util.ArrayList;
import java.util.List;
public class TestMethod {
    public void Student() {
        List<String> student1 = new ArrayList<>();
        student1.add("abhi");
        student1.add("dhanu");
        student1.add("vidya");
        student1.add("divya");
        student1.add("vidya");
        student1.add("dhanvi");
        student1.add("deeksha");
        student1.add("divya");
        student1.add("dhanu");
        student1.add("divya");
        student1.add("teja");

        int count = 0;
        List<Integer> Count = new ArrayList<>();
        List<String> Names = new ArrayList<>();

        for (int i = 0; i < student1.size(); i++) {
            for (int j = i + 1; j < student1.size(); j++) {
                // if(Names.get(j - 1) > Names.get(j)){
                //   if(Names.get(i) == Names.get(j))

                if (student1.lastIndexOf(student1.get(i)) != i) {
                    if (student1.get(i).equals(student1.get(j))) {
                        Count.add(count++);
                        Names.add(student1.get(i));

                    }
                }

            }
            //   System.out.println(Names + " is "+ count+ " times" + " duplicate ");

        }
        System.out.println(Names + " is " + count + " times" + " duplicate ");

    }}