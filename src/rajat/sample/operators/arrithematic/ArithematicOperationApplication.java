package rajat.sample.operators.arrithematic;

import java.util.Scanner;

public class ArithematicOperationApplication {
    int a=17 ,b=25;

    int add=a+b;
    int sub=a-b;
    int mul=a*b;
    float div=(float) a/b;
    float mod=(float) a%b;
    Scanner s= new Scanner(System.in);
    public void operation(){
        System.out.println("Addition,Subtraction,Multiplication,Division,Modulo:: choose one of the operation");
        String str=s.nextLine();
        switch(str){
            case "Addition":
                System.out.println(add);
                break;
            case "Subtraction":
                System.out.println(sub);
                break;
            case "Multiplication":
                System.out.println(mul);
                break;
            case "Division":
                System.out.println(div);
                break;
            case "Modulo":
                System.out.println(mod);
                break;

        }
    }

    public static void main(String[] args) {
        ArithematicOperationApplication aoa =new ArithematicOperationApplication();
        //Addition
        System.out.println("Addition of two number="+aoa.add);
        System.out.println("Subtraction of two number="+aoa.sub);
        System.out.println("Multiplication of two number="+aoa.mul);
        System.out.println("Division of two number="+aoa.div);
        System.out.println("Modulo of two number="+aoa.mod);
        aoa.operation();
        System.out.println("Successfully Running the Application");
    }
}
