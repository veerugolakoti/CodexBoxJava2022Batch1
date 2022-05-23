package GANESH.operations;
import java.util.*;
public class AoApplication {


    int add(int j, int l) {
        return j + l;
    }

    int sub(int j, int l) {
        return j - l;
    }

    int mul(int j, int l) {
        return j * l;
    }

    float div(int j, int l) {
        return (float)j / l;           //type casting
    }

    int mod(int j, int l) {
        return j % l;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value= 1");
        int v1 = Integer.parseInt(s.nextLine());
        System.out.println("Enter the value =2");
        int v2 = Integer.parseInt(s.nextLine());
        System.out.println("Enter the choice");
        System.out.println("=============choice==========");

        System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.mod");
        int choice = Integer.parseInt(s.nextLine());

        switch (choice) {
            case 1:
                AoApplication a1 = new AoApplication();
                System.out.println("sum=" + a1.add(v1, v2));
                break;
            case 2:
                AoApplication a2 = new AoApplication();
                System.out.println("sum= " + a2.sub(v1, v2));
                break;
            case 3:
                AoApplication a3 = new AoApplication();
                System.out.println("sum= " + a3.mul(v1, v2));
                break;
            case 4:
                AoApplication a4 = new AoApplication();
                System.out.println("sum= "+a4.div(v1, v2));
                break;
            case 5:
                AoApplication a5 = new AoApplication();
                System.out.println("sum= "+a5.mod(v1,v2));
                break;

            default:
                System.out.println("Invalid choice");


        }
    }
}