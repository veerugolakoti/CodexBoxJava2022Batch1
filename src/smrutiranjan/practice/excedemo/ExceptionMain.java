package smrutiranjan.practice.excedemo;

import smrutiranjan.practice.excedemo.ExceptionProg1;

public class ExceptionMain {
    public static void main(String[] args) {
        try{
            ExceptionProg1 ep = new ExceptionProg1();

            System.out.println("acc no:"+"\t"+"cust name:"+"\t");
            ep.setAccno(new int[]{11, 12, 13, 14});
            ep.setName(new String[]{"risi", "satya", "rabi", "laxmi", "subha"});
            ep.setBal(new long[]{1002,2001,3999,4580,2541,5900,7850});
            for(int i=0; i<4; i++){
                System.out.println(ep.getAccno()+"\t"+ep.getName()+"\t"+ep.getBal());

                if(ep.getBal()[i]<3000){
                    System.out.println("bal is low ");
                    throw ep;
                }
            }
        }catch(ExceptionProg1 e){
            e.printStackTrace();

        }
    }
}