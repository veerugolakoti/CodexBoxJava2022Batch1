package rajat.sample.strings;

import java.util.StringJoiner;

public class Join3StringApp {
    public static void main(String[] args) {
        String str1="I";
        String str2="Love";
        String str3="MySelf";
        String strJoin =String.join(" ",str1,str2,str3);
        System.out.println("Join Three String "+strJoin);
        System.out.println("========================");

        System.out.println("Using String Joiner class");
        StringJoiner stringJoiner = new StringJoiner("-");
        stringJoiner.add(str1);
        stringJoiner.add(str2);
        stringJoiner.add(str3);
        System.out.println(stringJoiner);

    }
}
