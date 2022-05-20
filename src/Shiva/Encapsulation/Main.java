package Shiva.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Lenovo");
        s1.setAdddress("Hyd");
        s1.setMarks(78.34);
        s1.setId(111);
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getAdddress());
        System.out.println(s1.getMarks());
    }
}
