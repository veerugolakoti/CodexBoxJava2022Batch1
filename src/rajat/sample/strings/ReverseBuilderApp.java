package rajat.sample.strings;

import javafx.util.Builder;

import java.util.Scanner;

public class ReverseBuilderApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        System.out.println("Using String Builder");
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
        System.out.println("=======================================");
        System.out.println();
        System.out.println("using String Buffer");
        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
    }
}
