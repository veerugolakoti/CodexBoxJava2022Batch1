package RAMESH.exception;

public class ExampleOfException {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a/b;
            System.out.println ("Result = " + c);
                }
                catch(ArithmeticException e) {
                    System.out.println ("Can't divide a number by 0");
                }
            }
        }


