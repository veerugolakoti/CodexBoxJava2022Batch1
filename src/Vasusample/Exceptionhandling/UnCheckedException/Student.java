package Vasusample.Exceptionhandling.UnCheckedException;

public class Student {
    private int RollNumber;
    private String name;

    public int getRollNumber() {
        return 1234;
    }

    public String getName() {
        return "vaasu";
    }

    public void Student(int rollnumber, String name) {
        {
            int a=10;
            try {
                a=a/0;
                System.out.println(a);

            } catch (Exception e) {
                System.out.println("arithmetic error came");
            }

        }
    }
}




