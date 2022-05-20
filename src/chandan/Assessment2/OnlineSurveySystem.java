package chandan.Assessment2;
import java.util.Scanner;

public class OnlineSurveySystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Online Survey System");
        int rate1 = 0, rate2 = 0, rate3 = 0, rate4 = 0, rate5 = 0, person = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total no. of participant ");
        int n=scanner.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.println("Enter your name : ");
            String e=scanner.next();

            System.out.println("Enter ID No. : ");
           int E= scanner.nextInt();

            String s = scanner.nextLine();
            System.out.println("1. Do you enjoy our company culture?");
            String s1 = scanner.nextLine();
            System.out.println("2. Do you feel connected to your teammates? ");
            String s2 = scanner.nextLine();
            System.out.println("3. Do you feel that you contribute to the company’s goals?");
            String s3 = scanner.nextLine();
            System.out.println("4. Do you feel valued?");
            String s4 = scanner.nextLine();
            System.out.println("5. Do you feel there is opportunity to grow?");
            String s5 = scanner.nextLine();
            System.out.println("6. Do you enjoy your day to day tasks?");
            String s6 = scanner.nextLine();
            System.out.println(s);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5);
            System.out.println(s6);


            System.out.println("Give your ratings");
            int rate = scanner.nextInt();

            switch (rate) {
                case 1:
                    rate1++;
                    System.out.println("No. of persons provided 1 star" + rate1);
                    break;
                case 2:
                    rate2++;
                    System.out.println("No. of persons provided 2 star" + rate2);
                    break;
                case 3:
                    rate3++;
                    System.out.println("No. of persons provided 3 star" + rate3);
                    break;
                case 4:
                    rate4++;
                    System.out.println("No. of persons provided 4 star" + rate4);
                    break;
                case 5:
                    rate5++;
                    System.out.println("No. of persons provided 5 star" + rate5);
                    break;

            }
            System.out.println("Thanks for the feedback");
            person++;
        }
            System.out.println("total persons " + person);
        }
    }

