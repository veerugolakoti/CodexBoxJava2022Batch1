package harshadeepthi.Demoprogram;

import java.security.PrivateKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Student implements Cloneable {
    public int Id;
    public String studentname;
    public double age;

    public Object getCloneMethod() throws CloneNotSupportedException {
        return clone();
    }
}