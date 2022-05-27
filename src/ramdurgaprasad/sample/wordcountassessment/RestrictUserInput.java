package JavaTraining.wordcountassessment;
import java.util.*;

class RestrictUserinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your input to get the word count excluding spaces:");

        int count = 0;
        while (input.hasNext()) {

            String str = input.nextLine();
//            String[] str1 = str.split(" ");
            count++;
            if (count >= 5) {
                break;
            }
            StringTokenizer strt = new StringTokenizer(str);
 {
                 System.out.println("The number of words you have entered in line is:" + strt.countTokens());

        }}

    }
}