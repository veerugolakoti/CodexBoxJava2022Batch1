package harshadeepthi.Demoprogram;

import java.security.PrivateKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Student implements Cloneable {
      public int Id;
      public String studentname;
      public double age;

    public Student(int Id, String studentname, Double age) throws CloneNotSupportedException {
        this.Id = Id;
        this.studentname = studentname;
        this.age = age;
    }
    public void Display(){
        System.out.println("Id" + Id);
        System.out.println("studentname" + studentname);
        System.out.println("age" + age);
    }
    public Object getCloneMethod() throws CloneNotSupportedException {
        return clone();
    }
}