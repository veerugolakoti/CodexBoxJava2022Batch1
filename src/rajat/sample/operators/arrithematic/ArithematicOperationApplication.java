package rajat.sample.operators.arrithematic;

import java.util.Scanner;

public class ArithematicOperationApplication {
    int a=17 ,b=25;

    public int add=a+b;
    public int sub=a-b;
    public int mul=a*b;
    public float div=(float) a/b;
    public float mod=(float) a%b;
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


}
