package rajat.sample.statement;

import java.util.Scanner;

public class BreakApplication {
    Scanner s=new Scanner(System.in);
    public void searchDay(){
        System.out.println("Enter a Number");
        int day=s.nextInt();
        String dayName;
        switch(day){
            case 1:
                dayName="Monday";
                break;
            case 2:
                dayName="Tuesday";
                break;
            case 3:
                dayName="Wednesday";
                break;
            case 4:
                dayName="Thursday";
                break;
            case 5:
                dayName="Friday";
                break;
            case 6:
                dayName="Saturday";
                break;
            case 7:
                dayName="Sunday";
                break;
            default:
                dayName="Invalid day number";
        }
        System.out.println(dayName);
    }

}
