package GANESH;

public class ImmutableApp {
    public static void main(String[] args) {
        String s = "leela";
        System.out.println(s.hashCode());
        s = "ganesh";
        System.out.println(s.hashCode());
    }
}
