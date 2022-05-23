package GANESH.ganipack;

public class DatatypesApplication   {
   int id = 202246;
   short value = 7894;
   long phno = 7989768155l;
   byte sm = 123;
   float price = 321.01f;
   char letter = 'j';
   boolean statement = true;
   double decimal = 78963.25;

   public static void main(String[] args) {
      DatatypesApplication dp = new DatatypesApplication();
      System.out.println("value="+dp.value);
      System.out.println("phno="+dp.phno);
      System.out.println("sm="+dp.sm);
      System.out.println("letter="+dp.letter);
      System.out.println("price="+dp.price);
      System.out.println("statement="+dp.statement);
      System.out.println("decimal="+dp.decimal);


   }

}
