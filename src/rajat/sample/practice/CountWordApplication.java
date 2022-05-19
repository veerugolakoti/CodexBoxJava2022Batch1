package rajat.sample.practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWordApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWord=0;
        System.out.println("Enter 5Line of sentence");
        for(int i=1;i<3;i++){
            System.out.println("Line"+i);
            String lines = scanner.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(lines," ");
            countWord =countWord+(stringTokenizer.countTokens());
        }
        System.out.println(countWord);
    }
}
