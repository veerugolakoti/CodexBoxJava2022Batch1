package rajat.sample.strings;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public void  getStringTokenizer() {
        String str="java is a programing language";
        StringTokenizer stringTokenizer=new StringTokenizer(str);
        System.out.println(str);
        int len=stringTokenizer.countTokens();
        System.out.println(len);

        while(stringTokenizer.hasMoreElements()){

            for (int i=1;i<=len;i++) {
                String str1=stringTokenizer.nextToken();
                if (str1.equals("a")) {
                    continue;
                }
                System.out.println(str1+"==>"+i);
            }
        }
    }
}
