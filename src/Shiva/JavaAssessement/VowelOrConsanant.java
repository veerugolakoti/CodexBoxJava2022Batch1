package Shiva.JavaAssessement;

public class VowelOrConsanant {
    public static void main(String[] args) {
        String str = "assessment programs";
        int vowel = 0;
        int consanant = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else if(ch >= 'a' && ch <= 'z') {
                consanant++;
            }
        }
        System.out.println("The number of vowels are: " + vowel);
        System.out.println("The number of consanants are: " + consanant);
    }
}
