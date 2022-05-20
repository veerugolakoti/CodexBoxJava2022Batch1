package junaid.sampleproject.Assessment3;

import java.util.Scanner;

public class GetSurvey
{
    public void getAnswer()
    {
        int count = 1;
        int count1 = 0;
        int count2 = 1;
        while (count >= 0)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Was our delivery is On time or Not?");
            String time = scanner.nextLine();
            System.out.println("2. How was our Food Quantity?");
            String quantity = scanner.nextLine();
            System.out.println("3. How was our Food Taste?");
            String taste = scanner.nextLine();
            System.out.println("4. Was our Cost-efficiency is ok or not?");
            String cost = scanner.nextLine();
            System.out.println("5. Did you face any Difficulties for ordering the Food?");
            String difficulties = scanner.nextLine();
            System.out.println("6. Do you have any Suggestions for us?");
            String suggestions = scanner.nextLine();
            System.out.println("Please provide ratings for us!");
            int ratings = scanner.nextInt();

            if (ratings == 1)
            {
              count++;
            }
        }
        System.out.println(count);
    }
}
