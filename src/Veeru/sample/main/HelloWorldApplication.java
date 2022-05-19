package Veeru.sample.main;

import Veeru.sample.abstraction.EmployeesAbstraction;
import Veeru.sample.employee.CodexBoxEmployee;
import Veeru.sample.employee.GoogleEmployee;
import Veeru.sample.impls.TaggedInterfaceExample;
import rajat.sample.employee.Employee;


public class HelloWorldApplication {
    protected TaggedInterfaceExample taggedInterfaceExample;
    public static void main(String[] args)  {
        TaggedInterfaceExample example1 = new TaggedInterfaceExample();
        example1.name = "Vidya";
        System.out.println(example1.name + " Actual  data");


        TaggedInterfaceExample  example2 = null;
        try {
            GoogleEmployee employee = (GoogleEmployee) example1.getTaggedInterfaceExample();
        } catch (ClassCastException ex) {
            System.out.println("I'm intended to get Classcast exception");
        }  catch (CloneNotSupportedException e) {
            System.out.println("I'm intended to get CloneNotSupportedException exception");
        }
        example1.name = "Veeru";
        System.out.println(example1.name + " Actual  data");
        System.out.println(example1.name + " Cloned Data");



    }
}
