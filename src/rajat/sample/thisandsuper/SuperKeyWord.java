package rajat.sample.thisandsuper;

public class SuperKeyWord extends ThisKeyWord{

    String name = "Rajat Kumar Behera";
    public SuperKeyWord(){
        super(5,8);
        System.out.println(name);
    }
    public void getSuper(){
        super.getInStanceVariable();
        System.out.println(super.j=j);
        System.out.println(super.k=k);

    }
}
