package Shiva.JavaAssessement2;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        int count = 0;
        String str = null;
        while(input.hasNext()) {
            str = input.nextLine();
            count++;
            if(count > 10) {
                return;
            }
            StringTokenizer stk = new StringTokenizer(str);
            System.out.println(stk.countTokens());
        }
    }
}
