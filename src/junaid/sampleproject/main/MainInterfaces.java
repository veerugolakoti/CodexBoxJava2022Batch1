package junaid.sampleproject.main;

import junaid.sampleproject.interfaces.InterfacesImpl;
import junaid.sampleproject.taggedinterfaces.TaggedInterfaces;

public class MainInterfaces
{
    public static void main(String[] args)
    {
      /*  InterfacesImpl interfaces = new InterfacesImpl();
        interfaces.getInterfaces();
*/
        TaggedInterfaces taggedInterface = new TaggedInterfaces();
        taggedInterface.aFloat = 7.5f;
        System.out.println("My Float Value is: " + taggedInterface.aFloat);

        TaggedInterfaces interfaces1 = null;

        try
        {
            InterfacesImpl interfaces2 = (InterfacesImpl) taggedInterface.getTaggedInterfaces();
        } catch (ClassCastException exception)
        {
            System.out.println("I am inside the ClassCastException....");
        } catch (CloneNotSupportedException e)
        {
            System.out.println("I am expected the CloneNotSupportedException..");
        }
        taggedInterface.aFloat = 8.5f;
        System.out.println("My Second value is: " + taggedInterface.aFloat);
    }
}
