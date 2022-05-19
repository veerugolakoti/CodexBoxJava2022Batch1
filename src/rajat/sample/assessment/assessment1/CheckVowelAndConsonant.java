package rajat.sample.assessment.assessment1;

import java.util.Scanner;

public class CheckVowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character::");
      String str=sc.next();
        System.out.println("========using Switch case===========");

      switch(str){
          case "a":
              System.out.println("a is a vowel");
              break;
          case "i":
              System.out.println("i is a vowel");
              break;
          case "o":
              System.out.println("o is a vowel");
              break;
          case "u":
              System.out.println("u is a vowel");
              break;
          case "e":
              System.out.println("e is a vowel");
              break;
          case "A":
              System.out.println("A is a vowel");
              break;
          case "I":
              System.out.println("I is a vowel");
              break;
          case "O":
              System.out.println("O is a vowel");
              break;
          case "U":
              System.out.println("U is a vowel");
              break;
          case "E":
              System.out.println("E is a vowel");
              break;
          default:
              System.out.println(str+" is a consonant");

        }
        //using if condition
        System.out.println("========using if Condition===========");
        if((str.equals("a")) || (str.equals("i")) || (str.equals("o")) || (str.equals("u")) || (str.equals("e"))){
            System.out.println(str+" is a vowel");
        }else if ((str.equals("A")) || (str.equals("I")) || (str.equals("O")) || (str.equals("U")) || (str.equals("E"))){
            System.out.println(str+" is a vowel");
        }else{
            System.out.println(str+" is a consonant");
        }
    }
}
