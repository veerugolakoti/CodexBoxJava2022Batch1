package rajat.sample.abstraction;

public class Addition extends Operation{
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public void addition() {
        int c=num1+num2;
        System.out.println("Result is::"+c);
    }

    @Override
    public void multiplication() {
        System.out.println("Result of multiplication::"+(num1*num2));

    }
    public void  division(){
        System.out.println(num1%num2);
    }
}
