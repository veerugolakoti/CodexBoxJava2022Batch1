package TejaAravind.overloadandoverride;

public class Teacher {
    int rollno;
    String name;
    int std;

    public Teacher(int roll, String str,int std){


        this.name = str;
        this.std = std;
        this.rollno = roll;
    }

    public Teacher() {
    }


    public void display(){
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(std);

    }

}
