package rehana.sample.Stringimmutability;

public class Main {
    public static void main(String[] args) {
        ImmutabilityExample i = new ImmutabilityExample("rehana",19,"thursday");
        System.out.println(i.getName());
        System.out.println(i.getDate());
        System.out.println(i.getDay());

        }
    }

