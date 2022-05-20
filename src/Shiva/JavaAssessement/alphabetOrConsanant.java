package Shiva.JavaAssessement;

public class alphabetOrConsanant {
    public static void main(String[] args) {

        char str = 'A';
        str = Character.toLowerCase(str);
        if(str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u') {
            System.out.println(str + " is vowel");
        } else {
            System.out.println(str + " is consanant");
        }
        System.out.println();
        switch (str) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(str + " is vowel");
                break;
            default:
                System.out.println(str + " is consonant");
        }
    }
}
