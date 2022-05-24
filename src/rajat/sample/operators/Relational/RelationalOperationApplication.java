package rajat.sample.operators.Relational;

public class RelationalOperationApplication {

    public void getRelationalOperator() {
        int num1=10 , num2=30;
        if (num1==num2){
            System.out.println("Numbers are equal");
        }else{
            System.out.println("Numbers are not equal");
        }
        if(num1>num2){
            System.out.println("Number1 is greater");
        }else{
            System.out.println("Number2 is greater");
        }
        if(num1<num2){
            System.out.println("number1 is smaller");
        }else{
            System.out.println("Number2 is smaller");
        }
    }
}
