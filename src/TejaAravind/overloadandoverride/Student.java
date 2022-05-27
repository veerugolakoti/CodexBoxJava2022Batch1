package TejaAravind.overloadandoverride;

public class Student extends Teacher {
    int rollno;
    String name;
    int std;

   public Student(int roll, String str, int std){

//       super(10,"ram");
//       this();
       super.name = str;
        super.std = std;
       super.rollno = roll;
       



      // System.out.println((super.name));

    }
//    Student (){
//        this(10);
//    }

//
//    public Student(int i) {
//        super();
//    }

    public void displa() {

        System.out.println(name);
        System.out.println(std);
        System.out.println(rollno);


    }
}
