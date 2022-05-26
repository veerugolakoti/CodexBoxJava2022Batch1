package Vasu.sample.javaInterfacemarker;

public class Interfacemarker implements Cloneable{
    public String name;
    public int id;

    String n;
    int i;

   public Interfacemarker(String name,int id){
       this.name=name;
       this.id=id;



   }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
