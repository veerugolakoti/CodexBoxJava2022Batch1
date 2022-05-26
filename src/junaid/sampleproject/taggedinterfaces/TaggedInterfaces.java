package junaid.sampleproject.taggedinterfaces;

public class TaggedInterfaces implements Cloneable
{
   public  Float aFloat ;

  public void display()
   {
       System.out.println("I am inside the TaggedInterface");

       int a = 20/0;
       System.out.println(a);
   }
   public Object getTaggedInterfaces() throws CloneNotSupportedException {
       return clone();
   }
}
