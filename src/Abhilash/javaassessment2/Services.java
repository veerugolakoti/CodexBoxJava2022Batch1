package Abhilash.javaassessment2;

import java.util.Scanner;

public class Services implements ServiceInterface {
    Scanner sc = new Scanner(System.in);

    @Override
    public void accountOpening() {
        System.out.println("You chosen AccountOpening");
        System.out.print("Enter Account holder Name : ");
        String accountHolderName = sc.nextLine();
        System.out.print("Enter your Mobile Number: ");
        long mobileNumber = sc.nextLong();
        System.out.print("Enter your Address: ");
        String Address = sc.next();
        System.out.println("Enter your MailId: ");
        String mailId = sc.next();
        System.out.println("Your Name is: " + accountHolderName);
        System.out.println("Your Mobile number is: " + mobileNumber);
        System.out.println("Your mailId number is: " + mailId);
        System.out.println("Your Address is: "+ Address);
        System.out.println("Your AccountOpening is being in process... ");
        System.out.println("   " );
        System.out.println("Your AccountOpening is successfully completed");
    }

    @Override
    public void speedPost() {
        System.out.println("SpeedPost");
        System.out.print("Enter From Address: ");
        String fromAddress = sc.nextLine();
        System.out.print("Enter your to Address: ");
        String toAddress = sc.nextLine();
        System.out.print("Enter distance:");
        int distance  =  sc.nextInt();
        if(distance >1 && distance <= 50) {
            System.out.println("Your tax is 200/- only");
        }
        if(distance >51 && distance <= 100) {
            System.out.println("Your tax is 400/- only");
        }
        if(distance >101 && distance <= 150) {
            System.out.println("Your tax is 700/- only");
        }
        else if(distance > 151 ){
            System.out.println("your tax is 1000/- only");
        }
        System.out.println("Your from address is: "+fromAddress);
        System.out.println("Your to address is: "+ toAddress);
        System.out.println("If you are okay with tax and all please type \"Okay\" ");

        String confirmationMsg = sc.next();

        if(confirmationMsg.equalsIgnoreCase("Okay")){
                System.out.println("your courier will process soon...");}
        else{
                System.out.println("your courier canceled");}
    }

    @Override
    public void sendingLetters() {
        System.out.println("sendingLetters");
        System.out.print("Enter From Address: ");
        String fromAddress = sc.nextLine();
        System.out.print("Enter your to Address: ");
        String toAddress = sc.nextLine();
        System.out.print("Enter distance:");
        int distance  =  sc.nextInt();
        if(distance >1 && distance <= 100) {
            System.out.println("Your tax is 100/- only");
        }
        if(distance >101 && distance <= 200) {
            System.out.println("Your tax is 200/- only");
        }
        if(distance >201 && distance <= 300) {
            System.out.println("Your tax is 300/- only");
        }
        else if(distance > 301 ){
            System.out.println("your tax is 500/- only");
        }
        System.out.println("Your from address is: "+fromAddress);
        System.out.println("Your to address is: "+ toAddress);
        System.out.println("If you are okay with tax and all please type \"Okay\" ");
        String confirmationMsg = sc.next();
        if(confirmationMsg.equalsIgnoreCase( "Okay")){
            System.out.println("your letter will process soon...");}
        else{
            System.out.println("your process canceled");}
    }

    @Override
    public void sendingLuggage() {
        System.out.println("sendingLuggage");
        System.out.print("Enter From Address: ");
        String fromAddress = sc.nextLine();
        System.out.print("Enter your to Address: ");
        String toAddress = sc.nextLine();
        System.out.print("Enter distance:");
        int distance  =  sc.nextInt();
        if(distance >1 && distance <= 100) {
            System.out.println("Your tax is 300/- only");
        }
        if(distance >101 && distance <= 150) {
            System.out.println("Your tax is 400/- only");
        }
        if(distance >151 && distance <= 200) {
            System.out.println("Your tax is 500/- only");
        }
        else if(distance > 201 ){
            System.out.println("your tax is 600/- only");
        }
        System.out.println("Your from address is: "+fromAddress);
        System.out.println("Your to address is: "+ toAddress);
        System.out.println("If you are okay with tax and all please type \"Okay\" ");
        String confirmationMsg = sc.next();
        if(confirmationMsg.equalsIgnoreCase("Okay")){
            System.out.println("your luggage will process soon...");
            System.out.println("Thank you"+"\n"+"visit again");
        }
        else{
            System.out.println("your luggage canceled");}

    }

    @Override
    public void sendingMoney() {
        System.out.println("sendingMoney");
        System.out.print("Enter From Address: ");
        String fromAddress = sc.nextLine();
        System.out.print("Enter your to Address: ");
        String toAddress = sc.nextLine();
        System.out.print("Enter distance:");
        int money  =  sc.nextInt();
        if(money >1000 && money <= 10000) {
            System.out.println("Your tax is 1000/- only");
        }
        if(money >10000 && money <= 100000) {
            System.out.println("Your tax is 300/- only");
        }
        if(money >100000 && money <= 200000) {
            System.out.println("Your tax is 1000/- only");
        }
        else if(money > 200001 ){
            System.out.println("your tax is 2300/- only");
        }
        System.out.println("Your from address is: "+fromAddress);
        System.out.println("Your to address is: "+ toAddress);
        System.out.println("If you are okay with tax and all please type \"Okay\" ");
        String confirmationMsg = sc.next();
        if(confirmationMsg.equalsIgnoreCase("Okay")) {
            System.out.println("your money will process soon...");
        }
        else {
            System.out.println("your money canceled");
        }
    }

    @Override
    public void packaging() {
        System.out.println("packaging");
        System.out.print("Enter From Address: ");
        String fromAddress = sc.nextLine();
        System.out.print("Enter your to Address: ");
        String toAddress = sc.nextLine();
        System.out.print("Enter distance:");
        int distance  =  sc.nextInt();
        if(distance >1 && distance <= 50) {
            System.out.println("Your tax is 150/- only");
        }
        if(distance >51 && distance <= 100) {
            System.out.println("Your tax is 300/- only");
        }
        if(distance >101 && distance <= 150) {
            System.out.println("Your tax is 400/- only");
        }
        else if(distance > 151 ){
            System.out.println("your tax is 600/- only");
        }
        System.out.println("Your from address is: "+fromAddress);
        System.out.println("Your to address is: "+ toAddress);
        System.out.println("If you are okay with tax and all please type \"Okay\" ");
        String confirmationMsg = sc.next();

        if(confirmationMsg.equalsIgnoreCase("Okay")){
            System.out.println("your packaging will process soon...");}
        else{
            System.out.println("your packaging sending canceled");}
        }
}
