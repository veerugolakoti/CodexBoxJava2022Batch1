package harshadeepthi.checkedexception;


import harshadeepthi.Demoprogram.Student;

public class Hellomain {
    protected Student student;
    public static void main(String[] Args)throws CloneNotSupportedException{
        MahatmaStudent mahatmaStudent=new MahatmaStudent();
        mahatmaStudent.setStudentId(2l);
        mahatmaStudent.setStudentName("HARSHADEEPTHI");
        mahatmaStudent.setStudentaddress("BHADRACHALAM");
        MahatmaStudent mahatmaclonedstudent=mahatmaStudent.getMahatmaStudent();
        System.out.println(mahatmaStudent.getStudentId());
        System.out.println(mahatmaStudent.getStudentName());
        System.out.println(mahatmaStudent.getStudentaddress());
        if(mahatmaStudent!=null){
            mahatmaclonedstudent.setStudentId(3l);
            mahatmaclonedstudent.setStudentName("SAIKEERTHI");
            mahatmaclonedstudent.setStudentaddress("AMEERPET");
        }
    }
}
