package Swathi.MarkerInterfaceEx;

public class MainMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
       Student M1=new Student();
       Student M2= (Student) M1.getinterfacemethod();
       M1.name="swathi";
       M2.age=23;
        System.out.println(M1.name);
        System.out.println(M2.age);
    }
}
