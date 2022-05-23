package rajat.sample.practice;

import java.util.Scanner;

public class OnlineSurveySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to CodexBox Plz give Your FeedBack");
        int personNumber=0,rate1=0,rate2=0,rate3=0,rate4=0,rate5=0,i=1;
        while(i>0){
            personNumber ++;
            System.out.println("Are you happy with our service");
            String str = scanner.next();
            System.out.println("Are you happy with our  food");
            String str1 = scanner.next();
            System.out.println("Do you Any suggestion");
            String str2 = scanner.next();
            System.out.println("Was our cost efficient is ok or not?");
            String str3 = scanner.next();
            System.out.println("How was our food quantity");
            String str4 = scanner.next();
            System.out.println("Thanks for Submitting the FeedBack");
            System.out.println("Plz provide rating for us");
            int star = scanner.nextInt();
            switch (star){
                case 1:
                    rate1++;
                    break;
                case 2:
                    rate2++;
                    break;
                case 3:
                    rate3++;
                    break;
                case 4:
                    rate4++;
                    break;
                case 5:
                    rate5++;
                    break;
                default:
                    System.out.println("Invalid Number...");
            }
            System.out.println("Number of participate in survey is::"+personNumber);
            System.out.println("Rate1:"+rate1);
            System.out.println("Rate2:"+rate2);
            System.out.println("Rate3:"+rate3);
            System.out.println("Rate4:"+rate4);
            System.out.println("Rate5:"+rate5);
            System.out.println();
            System.out.println();

        }

    }
}
