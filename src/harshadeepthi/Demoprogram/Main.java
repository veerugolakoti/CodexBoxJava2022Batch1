package harshadeepthi.Demoprogram;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        Student s2 = (Student) s1.getCloneMethod();
        s2.age = 20;
        s2.Id= 23;
        s2.studentname= "Harsha";
        System.out.println(s2.studentname);
        System.out.println(s2.Id);
        System.out.println(s2.age);

    }
}
