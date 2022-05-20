package rajat.sample.practice;

import java.util.Scanner;

import static java.lang.Math.round;

public class ExamSeatingArrangementApplication {
    Scanner scanner = new Scanner(System.in);

    String fName;
    String lName;
    long phNumber;
    String address;
    int hallTi;
    public void getGenerateHallTicket() {

        System.out.println("Enter no.of student participate in Exam");
        int stuNo = scanner.nextInt();
        for (int i=1;i<=stuNo;i++) {
            System.out.println("Enter Student First Name::");
           fName = scanner.next();
            System.out.println("Enter Student Last Name::");
            lName = scanner.next();
            System.out.println("Enter Phone Number::");
            phNumber = scanner.nextLong();
            System.out.println("Enter your Address::");
            String address = scanner.next();
            double hallticket = Math.random()*200;
            hallTi  = (int) Math.round(hallticket);
            System.out.println("Create HallTicket Number:; " + hallTi);
        }
    }
    void getStudentInformation(){
        System.out.println("Enter your HallTicket Number");
        int ticketNo = scanner.nextInt();
        if (ticketNo == hallTi){
            System.out.println(fName);
            System.out.println(lName);
            System.out.println(phNumber);
            System.out.println(address);
        }else {
            System.out.println("Invalid ticket Number");
        }
    }

    public static void main(String[] args) {
        ExamSeatingArrangementApplication arrangementApplication = new ExamSeatingArrangementApplication();
        arrangementApplication.getGenerateHallTicket();
        arrangementApplication.getStudentInformation();
    }
}
