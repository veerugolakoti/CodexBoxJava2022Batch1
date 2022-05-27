package ramdurgaprasad.sample.javaassessment;

public class SwappingNumbers {
    public static void main(String[] args) {

        int a = 10, b = 12;
        System.out.println("before swap the numbers are:" + "a=" + a + ",b= " + b);
        int t = a;
        a = b;
        b = t;
        System.out.println("after swap the numbers are:" + "a=" + a + ",b=" + b);
        String r = "R", s = "A", m = "M";
        System.out.println("before swap the strings are :");
        if (r == "R") {
            System.out.println("R");
            if (s == "A") {
                System.out.println("A");
                if (m == "M") {
                    System.out.println("M");
                }
            }
        }
        System.out.println("after swap the strings are:");
        String k = r;
        r = s;
        s = m;
        m = k;
        System.out.println(r + "" + s + "" + m);

        boolean w = true;
        boolean e = false;
        System.out.println("before swap"+w+""+e);
        System.out.println( "after swap"+!w +""+!e);
    }

}

