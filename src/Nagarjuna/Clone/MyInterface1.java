package Nagarjuna.Clone;

public class MyInterface1  implements Cloneable{
    String clgName;
    MyInterface1(String clgName) {
        this.clgName=clgName;

    }

    public String getClgName() {
        return clgName;
    }

    public MyInterface1 getClgNane() throws CloneNotSupportedException {

       try {
           return (MyInterface1)  clone();
       } catch (CloneNotSupportedException e) {
           System.out.println("This is checked exception");
       }

       return (MyInterface1) clone();
   }


}
