package vidya.frameworks;

import Sivannarayana.Assessment.immutabulate.immutable.Student;

import java.util.ArrayList;
import java.util.List;
public class Employee {
    public void Student() {
        List<String> student1 = new ArrayList<>();

        student1.add("vidya");
        student1.add("divya");
        student1.add("vidya");
        student1.add("dhanvi");
        student1.add("deeksha");
        student1.add("divya");
        student1.add("dhanu");

        int count = 0;
        List<Integer> Count = new ArrayList<>();
        List<String> Names = new ArrayList<>();

        for (int i = 0; i < student1.size(); i++) {
            for (int j = i + 1; j < student1.size(); j++) {

              //  if (student1.lastIndexOf(student1.get(i)) != i) {
                    if (student1.get(i).equals(student1.get(j))) {
                        Count.add(count++);
                        Names.add(student1.get(i));
                        break;
                    }

                }

            }
        System.out.println(Names + " is " + count + " times" + " duplicate ");

    }
    }



