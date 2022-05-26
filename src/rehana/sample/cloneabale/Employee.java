package rehana.sample.cloneabale;

public class Employee implements Cloneable  {
    String name;
    int id;
    double salary;
    String address;
   public Employee(String name,int id,double salary, String address) {
       this.name = name;
       this.id = id;
       this.salary = salary;
       this.address = address;
   }

    public static void add(String rehana) {
    }

    public void printdetails(){
       System.out.println("employee name:" +name);
       System.out.println("employee id:" +id);
       System.out.println("employee salary:" +salary);
       System.out.println("employee address:" +address);


   }
   public  Object getclone() throws CloneNotSupportedException {
       return clone();
   }




    }


