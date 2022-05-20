package sasi.sample.Singleton;
         public class Singleton {
        private static Singleton Si;
        private Singleton () {
            System.out.println("using constructor");
        }
        public static Singleton getInstance() {
            System.out.println("using static method with get instance");
            if (Si == null) {
                Si = new Singleton();
            }
            return Si;
        }
    }
        class  Main {
        public static void main(String[] args) {
          Singleton  Si1 =  Singleton.getInstance();
          Singleton  Si2 =  Singleton.getInstance();
            System.out.println(Si1);
            System.out.println(Si2);
        }
    }
