package RAMESH.singletone1;
 public class SingletonExample {
     static SingletonExample singletonExample1;

     private SingletonExample() {
         System.out.println("iam in singleton");
     }

     public static SingletonExample singletonExample1() {
         if (singletonExample1 == null) {
             singletonExample1 = new SingletonExample();
         }
         return singletonExample1;


     }
 }


