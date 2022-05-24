package rajat.sample.exceptionhandeling;

public class StringOutOfIndexClass {
    public void getStringIndexBound() {
        String str = "Rajat Kumar Behera ";
        char ch = str.charAt(10);
        System.out.println(ch);
        try {
            char ch1 = str.charAt(34);
            System.out.println("ch1");
        }catch (StringIndexOutOfBoundsException s){
            System.out.println("Invalid index number so provide valid index ....");
        }
    }
}
