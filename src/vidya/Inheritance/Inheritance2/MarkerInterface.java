package vidya.Inheritance.Inheritance2;

public class MarkerInterface implements Cloneable  {

    String name;

  int id ;
  int result;
   public MarkerInterface(String name ,int id ,int result){
      this.id = id;
      this.name = name;
      this.result = result;
  }



    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }




}
