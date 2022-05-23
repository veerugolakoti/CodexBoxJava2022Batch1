package smrutiranjan.practice.excedemo.trycatchex;

public class TryCatchD2  {
    public static void main(String[] args){
        try{
            int i[] = new int[5];
            System.out.println(i[10]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("print code:");
    }


}
