
package smrutiranjan.practice.excedemo.exceptionhandling;

public class Main {
    public static void main(String[] args) {

 //ExceptionProg1 program
        try{
            ExceptionProg1 ep = new ExceptionProg1();

            System.out.println("ExceptionProg1 program output :" + "acc no:"+"\t"+"cust name:"+"\t");
            ep.setAccno(new int[]{11, 12, 13, 14});
            ep.setName(new String[]{"risi", "satya", "rabi", "laxmi", "subha"});
            ep.setBal(new long[]{1002,2001,3999,4580,2541,5900,7850});
            for(int i=0; i<7; i++){
              //  System.out.println("ExceptionProg1 program output :" +ep.getAccno()+"\t"+ep.getName()+"\t"+ep.getBal());

                if(ep.getBal()[i]<3000){
                    System.out.println("bal is low ");
                    throw ep;
                }
            }
        }catch(ExceptionProg1 e) {
            e.printStackTrace();
        }


//ExceptionHandling program ;
        ExceptionHandling eh2 = new ExceptionHandling(2,"smr");

        eh2.getS();
        System.out.println( eh2.getI());
        System.out.println( eh2.getS());

        if (eh2 != null)
        {
            eh2.setI(4);
            eh2.setS("ran");
        }

//ExceptionPract program
        ExeptionPract me = new ExeptionPract("Balance is less than 1000");

        System.out.println("output of ExeptionPract :" + "ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

        me.exception();


        for (int i = 0; i < 5; i++) {

            System.out.println("ExceptionPract Prrogram output :"+me.getAccno() + "\t" + me.getBal() +
                    "\t" + me.getName());

            // display own exception if balance < 1000


         // if (me.getBal() < 2000) {


            //}

        }
       // System.out.println(me);
    }
}


