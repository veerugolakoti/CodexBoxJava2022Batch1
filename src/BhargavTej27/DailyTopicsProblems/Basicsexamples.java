package BhargavTej27.DailyTopicsProblems;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Basicsexamples {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inp=scanner.next();
    String str="ABCDEFGHIJ'KLMNOPQRS'TUVWXYZ";//To find length
        System.out.println("length of str " + inp.length());

        System.out.println("upeer case " + str.toUpperCase());//For uppercase
        System.out.println("lower case " + str.toLowerCase());//for lower case

        System.out.println(str.indexOf("KLMNOPQRS"));


    }

}
