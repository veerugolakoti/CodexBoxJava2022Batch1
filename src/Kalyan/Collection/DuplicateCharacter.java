package Kalyan.Collection;

public class DuplicateCharacter {
        public void character() {
            String str = "kalyan".toLowerCase();
            Integer[] ar = new Integer[26];
            for (int i = 0; i < str.length(); i++) {

                int j = str.charAt(i) - 'a';
                if (ar[j] == null) {
                    ar[j] = 1;
                } else {
                    ar[j] += 1;
                }
            }
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] != null && ar[i] > 1) {
                    char c = (char) (97 + i);
                    System.out.println("'" + c + "' comes " + ar[i] + " times.");
                }
            }
        }
    }

