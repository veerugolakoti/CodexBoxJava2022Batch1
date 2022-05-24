package Nagarjuna.MainExcution;

import Nagarjuna.ExceptionHandling.SalaryException;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("----------user defined exception----------");
        try {
            int id[] = {1, 2, 3, 4, 5};
            double sal[] = {12000.23, 6428.00, 23900.34, 29000.45, 38987.00, 45678.45};
            System.out.println("empno\t" +  "salary\t");
            for (int i = 0; i < 5; i++) {
                System.out.println(id[i] + "\t\t" + sal[i] + "\t");
                if (sal[i] < 50000) {
                throw new SalaryException();
                }
            }
        }catch(SalaryException e){
            System.out.println("my exception");
            }
        }
    }

