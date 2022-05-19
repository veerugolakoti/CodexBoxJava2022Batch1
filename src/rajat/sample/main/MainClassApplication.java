package rajat.sample.main;

import rajat.sample.student.Student;

import java.util.ArrayList;
import java.util.List;

public class MainClassApplication {
    public static void main(String[] args) {
       /* Employee e1 = new Employee();
        e1.setEmpName("Rajat");
        e1.setEmpId(202253);
        e1.setEmpPhNo(7008697185L);
        e1.setEmpAddress("Hyderabad");

        Employee e2 = new Employee();
        e2.setEmpName("Rajat");
        e2.setEmpId(202253);
        e2.setEmpPhNo(7008697185L);
        e2.setEmpAddress("Hyderabad");*/

        Student s1 =new Student();
        s1.setStuName("Lipu");
        s1.setStuRollNo(1001);
        s1.setsAddress("Odisha");
        s1.setsPhNo(911869715L);

        Student s2 =new Student();
        s2.setStuName("ram");
        s2.setStuRollNo(1002);
        s2.setsAddress("BBSR");
        s2.setsPhNo(911869715L);

        Student s3 =new Student();
        s3.setStuName("Rajat");
        s3.setStuRollNo(1003);
        s3.setsAddress("pdp");
        s3.setsPhNo(911869715L);

        Student s4 =new Student();
        s4.setStuName("Lipu");
        s4.setStuRollNo(1005);
        s4.setsAddress("hyd");
        s4.setsPhNo(911869715L);
        s4.setStuName("Lila");

        Student s5 =new Student();
        s5.setStuName("dipu");
        s5.setStuRollNo(1006);
        s5.setsAddress("ctc");
        s5.setsPhNo(911869715L);

        List<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        for(Student student:students){
            System.out.println(student.getStuName());
            System.out.println(student.getStuRollNo());
            System.out.println(student.getsPhNo());
            System.out.println(student.getsAddress());

        }

     /*   for(int i=0;i<students.size();i++) {
            // if(i==0) {
            Student student = students.get(i);
            System.out.println(student.getStuName());
            System.out.println(student.getStuRollNo());
            System.out.println(student.getsPhNo());
            System.out.println(student.getsAddress());
        }*/
        /*    } else if (i==1) {
                System.out.println(s2.getStuName());
                System.out.println(s2.getStuRollNo());
                System.out.println(s2.getsPhNo());
                System.out.println(s2.getsAddress());

            } else if (i==2) {
                System.out.println(s3.getStuName());
                System.out.println(s3.getStuRollNo());
                System.out.println(s3.getsPhNo());
                System.out.println(s3.getsAddress());
            } else if (i==3) {
                System.out.println(s4.getStuName());
                System.out.println(s4.getStuRollNo());
                System.out.println(s4.getsPhNo());
                System.out.println(s4.getsAddress());

            }   else
        }
          for(int i=0;i<students.size();i++){
            System.out.println("count class "+i);


            if(i==2){
                System.out.println("before using continue");
                continue;
            } else if (i==4) {
                System.out.println("BEFORE BREAK");
                break;
            }else{
              //
                System.out.println("flow properly");
            }

        }
*/
    }
}