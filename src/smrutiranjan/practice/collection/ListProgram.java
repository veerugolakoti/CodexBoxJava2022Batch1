package smrutiranjan.practice.collection;

import smrutiranjan.practice.empdetails.EmpDetails;

import java.util.*;

public class ListProgram {
    public void listProgram(){
        List<String> l = new ArrayList();
        String str = new String();


        l.add("ranjan ");
        l.add("smruti");
        System.out.println(l);

        List<EmpDetails> l2 = new ArrayList<>();
        EmpDetails emp1 = new EmpDetails();

        emp1.setEmpid(12);
        emp1.setEmpname("harsh");
        emp1.setEmpadd("hyd");
        emp1.setEmpsal(19900);

        EmpDetails emp2 = new EmpDetails();
        emp2.setEmpid(12);
        emp2.setEmpname("siva");
        emp2.setEmpadd("kornul");
        emp2.setEmpsal(12850);

        l2.add(emp1);
        l2.add(emp2);








    }
}
