package rajat.sample.statement;

public class ReturnApplication {
    public int sum(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        ReturnApplication returnApplication = new ReturnApplication();
        int result=returnApplication.sum(24, 40);
        System.out.println(result);
        for (int i=1;i<=10;i++){
            if(i==5){
                return;
            }
            System.out.println("Number="+i);
        }
    }
}
