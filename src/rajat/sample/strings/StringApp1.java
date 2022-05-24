package rajat.sample.strings;

public class StringApp1 {
    public void getStringAppication() {
        String str1= new String("Lipu");
        String str2="lipu";
        String str4= "dipu";
        String str3="  Chandan  ";
        String str="Rajat Kumar Behera";
        str2=str2+" rajat";
        System.out.println(str2);

        System.out.println("Compare two string Using == :: "+ (str1==str2));
        //using equals()
      System.out.println("Compare two string Using equals()::"+ (str1.equals(str2)));
      //equalsIgnoreCase()
        System.out.println("Compare two string Using equalsIgnoreCase()::"+(str1.equalsIgnoreCase(str2)));
        //toUppercase()
        System.out.println("Using toUppercase()::"+str.toUpperCase());
        //toLowercase()
        System.out.println("Convert String into lowercase using  toLowerCase()::"+str.toLowerCase());
        // replace()
        System.out.println("Using replace()::"+str.replace('R','S'));
        //subString()
        System.out.println("Using subString()::"+str.substring(0,4));
        //contains()
        System.out.println("Using contains()::"+str.contains("Behera"));
        //length()
        System.out.println("Calculate String length::"+str.length());
        //charAt()
        for (int i=0;i<str.length();i++){
            System.out.println("using charAt()::"+str.charAt(i));
        }
        //trim()
        System.out.println("Before using trim method::"+str3);
        System.out.println("After using trim method::"+str3.trim());
        //toString()
        System.out.println(str3.toString());
        //indexOf()
        System.out.println("To find any character index number by busing indexOf()::"+str.indexOf('B'));
        //compareTo()
        System.out.println("using compareTo()::"+str2.compareTo(str4));
        //using toCharArray()
        String longSrings="I am the employee of CodexBox";
        char[] chars=longSrings.toCharArray();
        System.out.println(longSrings.length());
        int count=0;
        for (char ch:chars) {
            if( (ch == 'a') || (ch == 'e') || (ch == 'o') || (ch == 'u') ||(ch == 'i')){
                count++;
            }
        }
        System.out.println("Number of vowels are::"+count);
        int countChar =0;
        for (char ch:chars) {
            if( !((ch == 'a') || (ch == 'e') || (ch == 'o') || (ch == 'u') ||(ch == 'i'))){
                countChar++;
            }
        }
        System.out.println("Count character in string without vowels::"+countChar);






    }
}
