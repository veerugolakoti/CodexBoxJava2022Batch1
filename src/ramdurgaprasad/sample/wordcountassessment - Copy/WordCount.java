package JavaTraining.wordcountassessment;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentences: ");
        String countwords = input.nextLine();
        String[] count = countwords.split(" ");
        int countw = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != " ") {
                countw++;
            }
        }
        System.out.println("The number of words entered by the user: " + countw);
        StringTokenizer stk = new StringTokenizer(countwords);
        System.out.println("The number of words: " + stk.countTokens());

        }
    }