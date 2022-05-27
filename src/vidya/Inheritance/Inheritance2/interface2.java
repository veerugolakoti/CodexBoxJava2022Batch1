package vidya.Inheritance.Inheritance2;

public class interface2 {


    public static void main(String[] args)throws CloneNotSupportedException {

        MarkerInterface m1 = new MarkerInterface("vidya", 22, 999);


        MarkerInterface b = (MarkerInterface) m1.clone();

        System.out.println(m1.name);
        System.out.println(m1.result);
        System.out.println(m1.id);

        System.out.println(b.name);
        System.out.println(b.result);
        System.out.println(b.id);

        }
    }
