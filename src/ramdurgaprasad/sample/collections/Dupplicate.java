package ramdurgaprasad.sample.collections;
import java.util.List;
import java.util.ArrayList;
public class Dupplicate {public static void main(String args[]) {
    String input = "abcad"; // Input value
    char[] chars = input.toLowerCase().toCharArray();
    List<Character> charR = new ArrayList<>();
    List<Integer> valR = new ArrayList<>();
    for (int i = 0; i < chars.length; i++) {
        char c = chars[i];
//        if (charR.contains(c)) {
            for (int i2 = 0; i2 < charR.size(); i2++) {
                if (charR.get(i2).equals(c)) {
                    valR.set(i2, valR.get(i2) + 1);

                    i2 = charR.size();
                } else {
                    i2++;
                }

//        } else { // Else...
////            charR.add(c); // Add the Character to the List
//            valR.add(1);
        }
        for (int i3 = 0; i3 < charR.size(); i3++) { // Loop through all the items
            // in the List
            System.out.println("'" + charR.get(i) + "' : " + valR.get(i));
        }
    }}}