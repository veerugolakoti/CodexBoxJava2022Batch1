package rajat.sample.assessment.assessment1;

public class SwappingApp {
    public static void main(String[] args) {
        //8type of datatype
        byte aa=1;
        short stateCode=20;
        int studentId=202252;
        long phNum=7008697185l;
        float cgpa=9.99f;
        double salary=54000.78;
        char fName='R';
        boolean bb=true;

            System.out.println("value of byte="+aa);
            System.out.println("StateCode="+stateCode);
            System.out.println("Student Id="+studentId);
            System.out.println("Student PhNo="+phNum);
            System.out.println("Student CGPA="+cgpa);
            System.out.println("salary="+salary);
            System.out.println("First Name of Letter:"+fName);
        System.out.println("value of boolean:"+bb);
        System.out.println("========================================");
        System.out.println();
        System.out.println("Start Swapping" +
                "");

        //integer
        int a=10;
        int b=2;
        System.out.println("Before Swapping the value a="+a+" b="+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After swapping the value a="+a+" b="+b);
        System.out.println("============================================");
        //float
        float i=9.6f;
        float j=3.4f;
        System.out.println("Before Swapping the value i="+i+" j="+j);
        float k=i;
        i=j;
        j=k;
        System.out.println("After swapping the value  i="+i+" j="+j);
        System.out.println("============================================");
        //double
        double d=234656.542;
        double e=42567.875;
        System.out.println("Before Swapping the value d="+d+" e="+e);
        double f=d;
        d=e;
        e=f;
        System.out.println("After swapping the value  d="+d+" e="+e);
        System.out.println("============================================");
        //byte
        byte g=1;
        byte h=3;
        System.out.println("Before Swapping the value g="+g+" h="+h);
        byte l=g;
        g=h;
        h=l;
        System.out.println("After swapping the value   g="+g+" h="+h);
        System.out.println("============================================");
        //short
        short a1=23;
        short a2=45;
        System.out.println("Before Swapping the value a1="+a1+" a2="+a2);
        short a3=a1;
        a1=a2;
        a2=a3;
        System.out.println("After swapping the value  a1="+a1+" a2="+a2);
        System.out.println("============================================");
        //long
        long b1=12345l ,b2=32445l;
        System.out.println("Before Swapping the value b1="+b1+" b2="+b2);
       long b3=b1;
       b1=b2;
       b2=b3;
        System.out.println("After swapping the value  b1="+b1+" b2="+b2);
        System.out.println("============================================");
        //char
        char ch='r';
        char ch1='f';
        System.out.println("Before Swapping the value  ch="+ch+" ch1="+ch1);
        char ch2=ch;
        ch=ch1;
        ch1=ch2;
        System.out.println("After swapping the value  ch="+ch+" ch1="+ch1);
        System.out.println("============================================");
        //boolean
        boolean s1=true;
        boolean s2=false;
        System.out.println("Before Swapping the value  s1="+s1+" s2="+s2);
        boolean s3=s1;
        s1=s2;
        s2=s3;
        System.out.println("After swapping the value    s1="+s1+" s2="+s2);


    }
}
