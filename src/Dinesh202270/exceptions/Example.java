package Dinesh202270.exceptions;
//package com.journaldev.util;

public class Example {

    public static void main(String[] args) {
        try{
            Example example=new Example();
            example.rethrow("abc");
        }catch(FirstException | SecondException | ThirdException e){
            //below assignment will throw compile time exception since e is final
            //e = new Exception();
            System.out.println(e.getMessage());
        }
    }

    void rethrow(String s) throws FirstException, SecondException,
            ThirdException {
        try {
            if (s.equals("First"))
                throw new FirstException("First");
            else if (s.equals("Second"))
                throw new SecondException("Second");
            else
                throw new ThirdException("Third");
        } catch (Exception e) {
            //below assignment disables the improved rethrow exception type checking feature of Java 7
            // e=new ThirdException();
            throw e;
        }
    }

     class FirstException extends Exception {

        public FirstException(String msg) {
            super(msg);
        }
    }

    static class SecondException extends Exception {

        public SecondException(String msg) {
            super(msg);
        }
    }

    static class ThirdException extends Exception {

        public ThirdException(String msgP) {
            super(msgP);
        }
    }

}
