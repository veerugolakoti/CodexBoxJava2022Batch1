package JavaTraining.javaassessment;

public class CalculatorApplication {
    public static void main(String[] args) {
        int a = 13, b = 36547654, c = 1, d;
    switch("-"){
        case "+" :d=a+b+c;
            System.out.println(d);
            break;
        case "-":d=a-b-c;
            System.out.println(d);
            break;
        case "*":d=a*b*c;
            System.out.println(d);
            break;
        case "/":d=a/b/c;
            System.out.println(d);
            break;
        case "%": d=a%b%c;
            System.out.println(d);
            break;
        case "":
            System.out.println("default");
    }
    }
}
