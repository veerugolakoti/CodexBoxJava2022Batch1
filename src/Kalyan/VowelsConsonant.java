package Kalyan;

public class VowelsConsonant {
    public static void main(String[] args) {
        String str = "k";
        if (str.toLowerCase().equals("a") || str.toLowerCase().equals("e") || str.toLowerCase().equals("i") || str.toLowerCase().equals("o") || str.toLowerCase().equals("u"))
        {
            System.out.println(str + " is vowel");
        }else{
            System.out.println(str + " is consonant");

        }

       /* String str = "A";
        switch (str.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(str + " is vowel");
                break;
            default:
                System.out.println(str + " is consonant");
        }*/
    }
}






