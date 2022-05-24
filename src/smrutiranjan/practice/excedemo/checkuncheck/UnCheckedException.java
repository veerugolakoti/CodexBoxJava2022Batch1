package smrutiranjan.practice.excedemo.checkuncheck;

public class UnCheckedException {
    void uncheckedExce() throws Exception {
    //Handle the exception using try catch
        try {
           int[] i = {1,1,21,13,29};
            System.out.println(i[7]);
       }catch(Exception e){
            System.out.println("print my unchecked exception :");
        //throw an exception using throw keyword
            throw new Exception(e);
        }
    }
}
