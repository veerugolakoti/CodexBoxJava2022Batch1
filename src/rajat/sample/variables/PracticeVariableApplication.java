package rajat.sample.variables;

public class PracticeVariableApplication {
    long phNo=7008697185l;
    static int empId=202252;
    public static void main(String[] args) {
        System.out.println("Rajat Kumar Behera");
        int age=24;
        System.out.println("My age is="+age);
        System.out.println("My EmpId="+empId);
        System.out.println("My EmpId="+PracticeVariableApplication.empId);

        PracticeVariableApplication pva= new PracticeVariableApplication();
        System.out.println("my phoneNo ="+pva.phNo);


    }
}
