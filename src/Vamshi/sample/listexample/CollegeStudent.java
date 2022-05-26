package Vamshi.sample.listexample;
import java.util.List;
import java.util.ArrayList;
public class CollegeStudent {
    public void testExample1() {
        List<String> student = new ArrayList<>();
        student.add("kalyan");
        student.add("naresh");
        student.add("kalyan");
        student.add("rajat");
        student.add("kalyan");
        student.add("vamshi");
        student.add("monika");
        student.add("vamshi");
        student.add("Kalyan");
        student.add("abhi");

        int count = 0;
        List<String> names = new ArrayList<>();
        List<Integer> Count =  new ArrayList<>();

        for(int i=0;i<student.size();i++){
            for(int j=i+1;j<student.size();j++){
                if(student.get(i).equalsIgnoreCase(student.get(j))) {
                    names.add(student.get(j));
                    Count.add(count++);
                    break;

                }

            }
        }
        System.out.println(" "+names+" "+Count+" ");
    }
}
