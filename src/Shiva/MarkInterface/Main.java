package Shiva.MarkInterface;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MarkerExample m1 = new MarkerExample();
        MarkerExample m2 = (MarkerExample) m1.clonnableObj();
        m1.name = "Black";
        System.out.println(m1.name);
    }
}
