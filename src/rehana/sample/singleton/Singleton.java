package rehana.sample.singleton;

public class Singleton {
    private static Singleton s;
    private String name;

    private Singleton() {
        System.out.println( name = "java");

    }

    public static Singleton display() {
      if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}
   class single {
            public static void main(String[] args) {
                Singleton S= Singleton.display();
               Singleton s1 =Singleton.display();
               System.out.println(s1);
                System.out.println(S);
            }

            }


