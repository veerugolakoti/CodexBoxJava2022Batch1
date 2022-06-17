package rajat.sample.collection;

import rajat.sample.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public void getEmpolyeeDetail(){
        Employee e1 = new Employee();
        e1.setEmpName("Rajat");
        e1.setEmpId(202253);
        e1.setEmpPhNo(7008697185L);
        e1.setEmpAddress("Hyderabad");

        Employee e2 = new Employee();
        e2.setEmpName("Junu");
        e2.setEmpId(202254);
        e2.setEmpPhNo(7008697180L);
        e2.setEmpAddress("Paradeep");
        Employee e3 = new Employee();
        e3.setEmpName("Lipuu");
        e3.setEmpId(202255);
        e3.setEmpPhNo(7008697105L);
        e3.setEmpAddress("Khordha");
        Employee e4 = new Employee();
        e4.setEmpName("Deepak");
        e4.setEmpId(202257);
        e4.setEmpPhNo(7008697285L);
        e4.setEmpAddress("Bhubaneswar");
        Employee e5 = new Employee();
        e5.setEmpName("Bhanaja");
        e5.setEmpId(202259);
        e5.setEmpPhNo(7008667185L);
        e5.setEmpAddress("Ctc");

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        for (Employee employee: list) {
            System.out.println(employee.getEmpName());
            System.out.println(employee.getEmpId());
            System.out.println(employee.getEmpPhNo());
            System.out.println(employee.getEmpAddress());
        }

    }
}
