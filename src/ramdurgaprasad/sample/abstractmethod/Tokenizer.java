package JavaTraining.abstractmethod;

import java.util.StringTokenizer;

public class Tokenizer {


    public static void main(String[] args) {


        StringTokenizer st = new StringTokenizer("the java is not complicated as i think", " ");

        int count = 0;
        while (st.hasMoreTokens()) {
            count++;
            String str=st.nextToken();
            if (str.equals("complicated")) {
              
                break;
            }
        }
        System.out.println(count);

    }
}
