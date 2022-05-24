package rajat.sample.datatype;

public class DataTypeApplication {
    byte a=1;
    short stateCode=20;
    int studentId=202252;
    long phNum=7008697185l;
    float cgpa=9.99f;
    double salary=54000.78;
    char fName='R';
    boolean b=true;

    public void getDataTypes() {
        DataTypeApplication dta= new DataTypeApplication();
        System.out.println("value of byte="+dta.a);
        System.out.println("StateCode="+dta.stateCode);
        System.out.println("Student Id="+dta.studentId);
        System.out.println("Student PhNo="+dta.phNum);
        System.out.println("Student CGPA="+dta.cgpa);
        System.out.println("salary="+dta.salary);
        System.out.println("First Name of Letter:"+dta.fName);
        System.out.println(dta.b);
        if(dta.b==true){
            System.out.println("my name is Rajat");
        }else{
            System.out.println("my name is lipu");
        }



    }


}
