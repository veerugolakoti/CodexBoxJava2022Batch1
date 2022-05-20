package Kalyan.Singleton;

 class Singleton {
     private static Singleton st;
     private Singleton() {
         System.out.println("singleton");
     }
     public static Singleton getInstance() {
         if (st == null) {
             st = new Singleton();
         }
         return st;
     }
 }



