package SASIFILE.inheritance;

public class Main {
    public static void main(String[] args) {

//       Father f = new Father();
//       f.setS("property");
//       Father f1 = new Child2();
        Father f = new Child2();
        Child2 ch = new Child2();

        f.setS("flag");
        ch.setI(100);

        //f.setS("property");
        System.out.println(f.getS());
        System.out.println(ch.getI());

    }

}
