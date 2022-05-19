package TejaAravind.basics.singleton.examSeatingApp;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Exam Seating Arrangement System Application");
        System.out.println("Kindly enter the student details");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numOfStudents = in.nextInt();
        Student[] arr = new Student[numOfStudents];


        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter the student "+ (i+1) +" details");
            arr[i] = getStudentDetails();
        }
        displayHallTicketNumber(arr);



        System.out.println("Enter the enterHallTicketNo value : ");
        String enterHallTicketNo = in.nextLine();
        int count = 0;



        while(!enterHallTicketNo.equalsIgnoreCase("exit")){
            for (Student student : arr) {
                String str = "" + student.getHallTicketNumber();
                if (enterHallTicketNo.equalsIgnoreCase(str)){
                    student.display();
                    count++;
                }
            }
            enterHallTicketNo = in.nextLine();

        }



        for (Student student : arr) {
            if (count == 0){
                student.display();
            }
        }


    }
    private static void displayHallTicketNumber(Student[] arr){
        for (Student student: arr) {
            System.out.println("Hall Ticket No of "+ student.getFirstName() +" " + student.getLastName()+" is " + student.getHallTicketNumber());
        }
    }



    private static int getRandomNumber() {
        int min = 100000000;
        int max = 500000000;
        return ( (int) (Math.random() * (max - min + 1) + min));

    }

    private static Student getStudentDetails() {
        Student student = new Student();
        student.addStudentDetails();
        int hallTicketNumber = getRandomNumber();
        student.setHallTicketNumber(hallTicketNumber);
        System.out.println(hallTicketNumber);
        return student;
    }


}
