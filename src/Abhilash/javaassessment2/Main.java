package Abhilash.javaassessment2;

import javax.xml.ws.Service;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to PostOffice");
        System.out.println("Services provided by us: \"1.Account Opening\",\"2.Speed Post\",\"3.Sending letters\", \"4.Sending luggage\" , \" 5.Sending Money \",\" 6.Packaging\" ");
        System.out.println("Which service do you want to choose: ");
        Scanner sc = new Scanner(System.in);
        ServiceInterface services = new Services();
        int ServiceNumber = sc.nextInt();
        switch(ServiceNumber){
            case 1:
                services.accountOpening();
                break;
            case 2:
                services.speedPost();
                break;
            case 3:
                services.sendingLetters();
                break;
            case 4:
                services.sendingLuggage();
                break;
            case 5:
                services.sendingMoney();
                break;
            case 6:
                services.packaging();
                break;

        }
    }
}
