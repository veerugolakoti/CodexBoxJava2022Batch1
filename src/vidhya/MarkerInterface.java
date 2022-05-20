package vidhya;

public class MarkerInterface implements Cloneable  {
  String name;
  int id ;
  int result;
   public MarkerInterface(String name ,int id ,int result){
      this.id = id;
      this.name = name;
      this.result = result;
  }
  public void displayDetails(){
      System.out.println("name : " +name );
      System.out.println("id " +id);
      System.out.println("result " +result);
  }



}
