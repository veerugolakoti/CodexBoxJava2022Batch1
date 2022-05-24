package Shiva.MainApplication;

import Shiva.Abstraction.Apple;
import Shiva.Abstraction.Banana;
import Shiva.Abstraction.Fruits;
import Shiva.Abstraction.Grapes;
import Shiva.Constructor.ConstructorEx;
import Shiva.Encapsulation.Student;
import Shiva.ExceptionHandling.ExceptionExample;
import Shiva.ExceptionHandling.FinallyClause.FinallyExample;
import Shiva.ExceptionHandling.UserDefinedException.ArthmeticEx;
import Shiva.FinalKeyword.FinalClassEx;
import Shiva.FinalKeyword.FinalMethod;
import Shiva.FinalKeyword.FinalVariables;
import Shiva.Interfaces.Bicycle;
import Shiva.Interfaces.Bike;
import Shiva.Interfaces.Car;
import Shiva.Interfaces.Vehicle;
import Shiva.MarkInterface.MarkerExample;
import Shiva.MethodOverloading.GreaterNum;

public class MainApp {
    public static void main(String[] args) {

        System.out.println();

        System.out.println("----Exception handling with clonaeable class---");
        ExceptionExample ex = new ExceptionExample();
        try {
            ex.myExceptionMethod();
        } catch (CloneNotSupportedException e) {
            System.out.println("cloneable class is not suported");
        }

        System.out.println();

        System.out.println("----Abstraction-----");
        Fruits f1 = new Apple();
        Fruits f2 = new Banana();
        Fruits f3 = new Grapes();
        System.out.println(f1.nutrition());
        System.out.println(f2.nutrition());
        System.out.println(f3.nutrition());

        System.out.println();

        System.out.println("---constructor---");
        ConstructorEx con = new ConstructorEx(4,"Blue", 400000.99);
        con.carDetails();
        ConstructorEx con2 = new ConstructorEx(2, "White", 60000.99);
        con2.carDetails();

        System.out.println();

        System.out.println("---Encapsulation---");
        Student s2 = new Student();
        s2.setName("Lenovo");
        s2.setAdddress("Hyd");
        s2.setMarks(78.34);
        s2.setId(111);
        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println(s2.getAdddress());
        System.out.println(s2.getMarks());

        System.out.println();

        System.out.println("---Interface---");
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Bicycle();
        v1.speed();
        v2.speed();
        v3.speed();

        System.out.println();

        System.out.println("---Marker Interface---");
        MarkerExample m1 = new MarkerExample();
        try {
            MarkerExample m2 = (MarkerExample) m1.clonnableObj();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not suported");
        }
        m1.name = "Black";
        System.out.println(m1.name);

        System.out.println();

        System.out.println("---Method overriding---");
        System.out.println("The greater number is: " + GreaterNum.max(10,12));
        System.out.println("The greater number is: " + GreaterNum.max(12.2, 3.3));

        System.out.println();

        System.out.println("---Final keyword---");
        FinalClassEx fn = new FinalClassEx();
        fn.run();
        FinalVariables fv = new FinalVariables();
        System.out.println(fv.getNum1());
        System.out.println(fv.getNum2());
        FinalMethod fm = new FinalMethod();
        fm.finalMethod();

        System.out.println();

        System.out.println("---User defined exception---");
        ArthmeticEx aex = new ArthmeticEx();
        aex.arthmeticExample(12, 0);
    }
}
