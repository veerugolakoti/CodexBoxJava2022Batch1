package Veeru.sample.employee;

import Veeru.sample.abstraction.EmployeesAbstraction;
import rajat.sample.interfaces.MyInterface;


public class GoogleEmployee extends EmployeesAbstraction {

    @Override
    public String qualification() {
        return "B.e, Btech. M.e, Mtech";
    }

    @Override
    public String careerPercentage() {
        return "90%";
    }

   public GoogleEmployee getGoogleEmployee() throws CloneNotSupportedException {
       GoogleEmployee googleEmployee = null;
       try {
          Object object = clone();
           googleEmployee =  (GoogleEmployee) object;
          // return googleEmployee;
          // return (GoogleEmployee)clone();
      } catch (CloneNotSupportedException e) {
           System.out.println("This exception comes when your class doesn't implement Cloneable inteface");
       }
       return  googleEmployee;
   }


}
