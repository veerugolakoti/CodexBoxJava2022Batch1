package GANESH.strings;

import java.util.*;


public class StringTokenizerApplication {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the String:");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, "a");

        {
            System.out.println("====Display Tokens====");
            while (st.hasMoreTokens()) {
                String tk = st.nextToken();
                System.out.println(tk);
            }//end of loop

        }
    }
}
