package Shiva.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s2 = new Student();
        s2.setName("Lenovo");
        s2.setAdddress("Hyd");
        s2.setMarks(78.34);
        s2.setId(111);
        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println(s2.getAdddress());
        System.out.println(s2.getMarks());
    }
}
