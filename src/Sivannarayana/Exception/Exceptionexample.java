package Sivannarayana.Exception;

import org.omg.CORBA.INTERNAL;

public class Exceptionexample {
            public static int Youtube(int a, int b){
               int f = a/b;
               return f;
            }
        public static   int whatsup(int a,int b) {
               int ans = 0;
               try {
                 ans = Youtube(a,b);
               }
               catch (ArithmeticException sr){
                  System.out.println("ArthamaticException will come");
               }
               return ans;
               }

            }



