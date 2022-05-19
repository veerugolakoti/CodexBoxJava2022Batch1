package rajat.sample.scanner;

import java.util.Scanner;

public class ScannerClass {
    public void getScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name::");
        String name = scanner.nextLine();
        System.out.println("Enter your nick Name:");
        String nickName = scanner.next();
        System.out.println("Enter a EmpId::");
        int empId = scanner.nextInt();
        System.out.println("Enter your salary::");
        double salary = scanner.nextDouble();
        System.out.println("Enter your bonus::");
        float bonus = scanner.nextFloat();
        System.out.println("Name ::"+name);
        System.out.println("NickName::"+nickName);
        System.out.println("EmpId:;"+empId);
        System.out.println("Salary::"+salary);
        System.out.println("Bonus:;"+bonus);


    }
}
