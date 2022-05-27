package JavaTraining.javaassessment;

public class AlphabetChecking {
    public static void main(String[] args) {
        char i='a';
        switch(i){
            case 'a' & 'A':

            case'e':

            case 'i':

            case 'o':

            case'u':
                System.out.println("the given alphabet is vowel");
                break;

        }
        String str = "a";
        if(str.equalsIgnoreCase("a") || str.equalsIgnoreCase("e") || str.equalsIgnoreCase("i")) {
            System.out.println("given alphabet is vowel");
        }else{
            System.out.println("given alphabet is consonant");

        }
    }
}
