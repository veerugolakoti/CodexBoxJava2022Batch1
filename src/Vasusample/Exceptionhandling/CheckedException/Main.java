package Vasusample.Exceptionhandling.CheckedException;

public class Main {
    public static void main(String[] args) {
        CapgeminiEmployee capgeminiEmployee = new CapgeminiEmployee();
//        System.out.println(capgeminiEmployee.careerpersentage());
//        System.out.println(capgeminiEmployee.qualification());
        capgeminiEmployee.setAdress("hydaaaaa");
        capgeminiEmployee.setId(2637);
        System.out.println(capgeminiEmployee.getAdress());
        System.out.println(capgeminiEmployee.getId());



        CapgeminiEmployee capgeminiEmployee1 = capgeminiEmployee.getCapgeminiEmployee();
        capgeminiEmployee1.setAdress("hyd");
        capgeminiEmployee1.setId(234325);
        System.out.println(capgeminiEmployee1.getAdress());
        System.out.println(capgeminiEmployee1.getId());
    }
}