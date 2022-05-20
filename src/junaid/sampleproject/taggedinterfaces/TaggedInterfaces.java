package junaid.sampleproject.taggedinterfaces;

public class TaggedInterfaces implements Cloneable
{
   public  Float aFloat ;

   void display()
   {
       System.out.println("I am inside the TaggedInterface");
   }
   public Object getTaggedInterfaces() throws CloneNotSupportedException {
       return clone();
   }
}
