package junaid.sampleproject.main;

import junaid.sampleproject.exceptionhandling.UserDefinedException;
import junaid.sampleproject.taggedinterfaces.TaggedInterfaces;

public class MainApplication
{
    public static void main(String[] args) throws UserDefinedException
    {
      /*  InterfacesImpl interfaces = new InterfacesImpl();
        interfaces.getInterfaces();
*/
        TaggedInterfaces taggedInterface = new TaggedInterfaces();
        taggedInterface.aFloat = 7.5f;
        System.out.println("My Float Value is: " + taggedInterface.aFloat);

        TaggedInterfaces interfaces1 = null;
        try {
        taggedInterface.display();

            TaggedInterfaces taggedInterfaces = new TaggedInterfaces();
        } catch (ArithmeticException e) {
            System.out.println("There is a Arithmetic Exception");
        }
//          try
//          {
//         InterfacesImpl interfaces2 = (InterfacesImpl) taggedInterface.getTaggedInterfaces();
//         System.out.println(interfaces2.hashCode());
//        }
//          catch (ClassCastException exception)
//        {
//            System.out.println("I am inside the ClassCastException....");
//        }
//          catch (CloneNotSupportedException e)
//         {
//             System.out.println("I am expected the CloneNotSupportedException..");
//         }
         taggedInterface.aFloat = 8.5f;
         System.out.println("My Second value is: " + taggedInterface.aFloat);

        System.out.println("==============USER DEFINED EXCEPTION=======================");
       try {
           throw  new UserDefinedException("Mohammed");
       }catch (UserDefinedException exception) {
           System.out.println("I am inside the UserDefinedException");
//           System.out.println(exception.getMessage());
       }

    }
    }
