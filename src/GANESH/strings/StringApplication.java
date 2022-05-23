package GANESH.strings;

public class StringApplication {

    public static void main(String[] args) {
        String s = "ganesh";//String literal process
        String  s1 = new String("leela");//String new operator process
        String s2 =s.concat (s1);//concatenation process
int len1= s.length();
int len2=s1.length();
int len3= s2.length();
        System.out.println("============details==========");
        System.out.println("s="+s.toString());
        System.out.println("length of s1 = len1");
        System.out.println("s1 ="+s1.toString());
        System.out.println("length of s2 ="+len2);
        System.out.println("s2 = "+s2.toString());
        System.out.println("length of s3 ="+len3);






    }




}
