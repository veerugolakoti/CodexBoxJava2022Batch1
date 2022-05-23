package smrutiranjan.practice.excedemo.trycatchex;

public class TryCatchD3 {
    public static void main(String[] args){
        try{
            String s= null;
            System.out.println(s.length());
    } catch (ArithmeticException e) {
            System.out.println("arithmatic excepttion:");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array out of index exception:");
        }
        catch(Exception e){
            System.out.println("main exception :");
        }
        System.out.println("print rest of the code:");
    }
}
