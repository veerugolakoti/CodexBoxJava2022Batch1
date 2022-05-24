package harshadeepthi.Exception;

public class Age {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException(" access denied : atleast you must have 18 years old");
        } else {
            System.out.println("access granted:you are old ");
        }
    }

    public static void main(String[] args) {
        checkAge(20); //not get exception
        checkAge(14);//get exception
    }
}