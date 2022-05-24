package Ravaliproject.exceptionhandling.uncheckedexception;

public class NullpointerException {
    String s = null;

    public void display() {
        try {
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("its nullpointer exception");
        }
        // return NullPointerException();


    }
}










        //    throw new RuntimeException(e);

     //       }

      //  }
   // }
     //  catch (NullPointerException p) {
         //   System.out.println(p);

        //    } catch (ClassCastException C) {
        //      System.out.println(C);
        //   }
  //  }
//}

  /*/   int a= 10;
     int b= 0;
;
     int div;
   try{
        div = a/b;

    }
    catch(Exception e){
        System.out.println(e)
    }

    }
}

   /* public Employee String;
    public int id;

    @Override
    public java.lang.String name() {
        return null;
    }

    @Override
    public int id() {
        return 0;
    }

    @Override
    public java.lang.String salary() {
        return null;
    }
    public
    }
   */
