package BhargavTej27.DailyTopicsProblems;

import java.util.Scanner;

public class OperatorsExamples {
//    String arr[]={"1.Puri","2.Dosa","3.Upma","4.Idly","5.Bonda","6.Vada","7.Pongal"};

    public static void main(String[] args) {
        String arr[]={"Puri","Dosa","Upma","Idly","Bonda","Vada","Pongal"};
//        OperatorsExamples menu=new OperatorsExamples();
        System.out.println("Menu");
        int i;
        for (i=0;i<arr.length;i++){
            System.out.println(i+1 + " Select Items " + arr[i]);
        }


//        System.out.println(menu.arr);
        int num;
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any no upto 7 ");
        int inp = scanner.nextInt();
        num = inp;
        switch (num) {
            case 1:
                System.out.println("Puri");
                break;
            case 2:
                System.out.println("Dosa");
                break;
            case 3:
                System.out.println("Upma");
                break;
            case 4:
                System.out.println("Idly");
                break;
            case 5:
                System.out.println("Bonda");
                break;
            case 6:
                System.out.println("Vada");
                break;
            case 7:
                System.out.println("Pongal");
                break;
            default:
                System.out.println("Pulihora");
        }
        System.out.println("enter dish name");
        str = scanner.next();
//        System.out.println("enter dish name");
        switch (str) {
            case "Puri":
                System.out.println(1);
                break;
            case "Dosa":
                System.out.println(2);
                break;
            case "Upma":
                System.out.println(3);
                break;
            case "Idly":
                System.out.println(4);
                break;
            case "Bonda":
                System.out.println(5);
                break;
            case "Vada":
                System.out.println(6);
                break;
            case "Pongal":
                System.out.println(7);
                break;
            default:
                System.out.println(8);
        }
    }
}