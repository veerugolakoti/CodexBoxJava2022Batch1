package junaid.sampleproject.Assessment3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Objects;
import java.util.Scanner;

public class GetSurvey {

    public void getAnswer() {
        int count ;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Was our delivery is On time or Not?");
            String time1 = scanner.nextLine();

            if(time1.equalsIgnoreCase("yes"))
            {
                System.out.println("Thank you");
            }
            else
            {
                System.out.println("We improve our timing.");
            }

            System.out.println("2. How was our Food Quantity?");
            String quantity = scanner.nextLine();
            if (quantity.equalsIgnoreCase("good"))
            {
                System.out.println("Thank you");
            }
            else {
                System.out.println("We Increase our Food Quantity");
            }
            System.out.println("3. How was our Food Taste?");
            String taste = scanner.nextLine();
            if (taste.equalsIgnoreCase("good"))
            {
                System.out.println("Thank you");
            }
            else {
                System.out.println("We definitely make your food delicious");
            }
            System.out.println("4. Was our Cost-efficiency is ok or not?");
            String cost = scanner.nextLine();
            if (cost.equalsIgnoreCase("ok"))
            {
                System.out.println("Thank you");
            }
            else {
                System.out.println("We definitely give you some discounts");
            }
            System.out.println("5. Did you face any Difficulties for ordering the Food?");
            String difficulties = scanner.nextLine();
            if (difficulties.equalsIgnoreCase("no"))
            {
                System.out.println("Thank you");
            }
            else {
                System.out.println("Don't worry, we will solve all the difficulties which you are facing");
            }
            System.out.println("6. Do you have any Suggestions for us?");
            String suggestions = scanner.nextLine();
            if (suggestions.equalsIgnoreCase("yes"))
            {
                System.out.println("Then go ahead");
                String suggestion = scanner.nextLine();
            }
            else {
                System.out.println("Thank you");
            }
            System.out.println("Please provide ratings for us!");
            int ratings = scanner.nextInt();
            if (ratings == 6) {
                break;
            }

            if (ratings == 1) {
                count1++;
                System.out.println(count1);
            }
            if (ratings == 2) {
                count2++;
                System.out.println(count2);
            }
            if (ratings == 3) {
                count3++;
                System.out.println(count3);
            }
            if (ratings == 4) {
                count4++;
                System.out.println(count4);
            }
            if (ratings == 5) {
                count5++;
                System.out.println(count5);
            }
            System.out.println("If you want to know the count of the given feedback persons, then type \"break\" ");
            String counts = "";
            if (counts.equalsIgnoreCase("break")) {
                break;
            }
        }
        count = count1 + count2 + count3 + count4 + count5;
        System.out.println("Total no.of feedback we got are: " + count);
        System.out.println("The One Star count is: " + count1);
        System.out.println("The Two Star count is: " + count2);
        System.out.println("The Three Star count is: " + count3);
        System.out.println("The Four Star count is: " + count4);
        System.out.println("The Five Star count is: " + count5);
    }
}


