package Shiva.JavaAssessement;

public class vowelOrCon {
    public static void main(String[] args) {
        String str = "A";
        if(str.equalsIgnoreCase("a") || str.equalsIgnoreCase("e") || str.equalsIgnoreCase("i") || str.equalsIgnoreCase("o") || str.equalsIgnoreCase("u")) {
            System.out.println(str + " is vowel");
        } else {
            System.out.println(str + " is consonant");
        }
    }
}
