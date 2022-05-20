package TejaAravind.singleton;
class Staticblock {
    static int i = 10;

    static {
        System.out.println(i);
    }
    Staticblock (){
        System.out.println("Constructor called");
    }

    

}
class sb2{
    public static void main(String[] args) {
        Staticblock st1 = new Staticblock();
        Staticblock st2 = new Staticblock();

    }

}
