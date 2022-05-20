package junaid.sampleproject.Assessment3;

import java.util.Scanner;

public class GetSurvey {

    public void getAnswer() {
        int count = 1;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        while (count>=0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Was our delivery is On time or Not?");
            String time = scanner.nextLine();
            if(time.equalsIgnoreCase("break")){
                break;
            }
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
            if(ratings == 6){
                break;
            }

            if (ratings == 1)
            {
              count1++;
                System.out.println(count1);
            }
            if(ratings == 2){
                count2++;
                System.out.println(count2);
            }
            if(ratings == 3){
                count3++;
                System.out.println(count3);
            }
            if(ratings == 4){
                count4++;
                System.out.println(count4);
            }
            if(ratings == 5) {
                count5++;
                System.out.println(count5);
            }
        }
        count = count1+count2+count3+count4+count5;
        System.out.println("total count is" + count);

        }
    }


