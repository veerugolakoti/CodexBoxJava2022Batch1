package rajat.sample.assessment.assessment2;

import java.util.Scanner;

public class ChooseProduct {
    int total=0;
    Scanner scanner = new Scanner(System.in);

    public void getShopProduct() {
        System.out.println("WELCOME TO VRS SUPER MARKET");
        System.out.println("Select the Product  ");
        System.out.println("1.Oil-120\n2.SR Rice-2500\n3.WheatFlour-350\n4.Amul Milk-20\n5.Eggs-130\n6.LuxSoap-45\n7.Ariel Detergent-999\n8.Red Label-180\n9.Tata Salt-14\n10.MarieGold-50");
        for (int i=1;i<=100;i++){

            System.out.println("Enter your product Number: ");
            int product = scanner.nextInt();
            switch (product) {
                case 1:
                    System.out.println("Oil");
                    total+=120;

                    System.out.println("Do you add any product?");
                    String add = scanner.next();
                    switch(add) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            getBillGenerate();
                            return;
                    }
                    break;
                case 2:
                    System.out.println("SR_Rice");
                    total+=2500;

                    System.out.println("Do you add any product?");
                    String add1 = scanner.next();
                    switch(add1) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            getBillGenerate();
                            return;
                    }
                    break;
                case 3:
                    System.out.println("WheatFlour");
                    total+=350;

                    System.out.println("Do you add any product?");
                    String add2 = scanner.next();
                    switch(add2) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            getBillGenerate();
                            return;
                    }
                    break;
                case 4:
                    System.out.println("Amul Milk");
                    total+=20;

                    System.out.println("Do you add any product?");
                    String add3 = scanner.next();
                    switch(add3) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            getBillGenerate();
                            return;
                    }
                    break;
                case 5:
                    System.out.println("Eggs");
                    total+=130;

                    System.out.println("Do you add any product?");
                    String add4 = scanner.next();
                    switch(add4) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            getBillGenerate();
                            return;
                    }
                    break;
                case 6:
                    System.out.println("Soap");
                    total+=45;

                    System.out.println("Do you add any product?");
                    String add5 = scanner.next();
                    switch(add5) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            getBillGenerate();
                            return;
                    }
                    break;
                case 7:
                    System.out.println("Ariel_Detergent");
                    total+=999;

                    System.out.println("Do you add any product?");
                    String add6 = scanner.next();
                    switch(add6) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            getBillGenerate();
                            return;
                    }
                    break;
                case 8:
                    System.out.println("Red Label");
                    total+=180;

                    System.out.println("Do you add any product?");
                    String add7 = scanner.next();
                    switch(add7) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            getBillGenerate();
                            return;
                    }
                    break;
                case 9:
                    System.out.println("Tata Salt");
                    total+=14;

                    System.out.println("Do you add any product?");
                    String add8 = scanner.next();
                    switch(add8) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            getBillGenerate();
                            return;
                    }
                    break;
                case 10:
                    System.out.println("MarieGold");
                    total+=50;

                    System.out.println("Do you add any product?");
                    String add9 = scanner.next();
                    switch(add9) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            getBillGenerate();
                            return;
                    }
                    break;
                default:
                    System.out.println("Product code is invalid");
            }
            System.out.println(total);

        }


    }

    public void getBillGenerate() {
        System.out.println("Should I do the bill yes or Not");
        String str= scanner.next();
        switch (str){
            case "yes":

                System.out.println("Enter your Account Balance : ");
                int accountBalance=scanner.nextInt();

                if(accountBalance>total) {
                    System.out.println("The Bill is Generated Successfully");
                    System.out.println("Thank You and Visit Again");
                }
                else {
                    System.out.println("Insufficient Balance");
                    System.out.println("Please Reduce the products");
                }
                break;
            case "no":
                System.out.println("Please visit again");
                System.out.println("Thank You");
                break;
        }
    }
}
