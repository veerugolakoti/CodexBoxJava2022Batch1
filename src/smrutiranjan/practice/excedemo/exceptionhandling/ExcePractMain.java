
package smrutiranjan.practice.excedemo.exceptionhandling;

public class ExcePractMain {
    public static void main(String[] args) {
        ExeptionPract me = new ExeptionPract("Balance is less than 1000");

        System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

        me.exception();


        for (int i = 0; i < 5; i++) {

            System.out.println(me.getAccno() + "\t" + me.getBal() +
                    "\t" + me.getName());

            // display own exception if balance < 1000


         // if (me.getBal() < 2000) {


            //}

        }
       // System.out.println(me);
    }
}


