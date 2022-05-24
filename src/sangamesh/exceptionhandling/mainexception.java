package sangamesh.exceptionhandling;

public class mainexception extends RuntimeException implements Cloneable{
    public static void main(String[] args)  {
        employee emp = new employee("sangam","hyd");
        System.out.println(emp.getName());
        System.out.println(emp.getAddress());

        employee emp2 = null;
//        try {
//            emp2 = emp.getClone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }

        try {
            System.out.println(emp2.getAddress());
            System.out.println(emp2.getName());
        }catch (Exception e){
            System.out.println("sangam exception");
        }





    }

}
