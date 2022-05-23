package Nagarjuna.Clone;

public class MyInterface {
    int rollno;
    String name;
    String courseName;

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getCourseName() {
        return courseName;
    }

    MyInterface(int rollno, String name, String courseName) {
       this.rollno=rollno;
       this.name=name;
       this.courseName=courseName;

    }

}
