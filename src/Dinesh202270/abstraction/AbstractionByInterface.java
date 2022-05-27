package Dinesh202270.abstraction;

public interface AbstractionByInterface {

    void Method1();
    boolean method2();
    void method3();
    }





   abstract class OldClass implements AbstractionByInterface, Abstraction
    {
        @Override
        public void Method1() {
            System.out.println("im in method 1");
        }

        @Override
        public boolean method2() {
            System.out.println("im in method 2");
            return false;
        }

        @Override
        public void method3() {
            System.out.println("im in method 3");
        }

        @Override
        public void method4() {

            System.out.println("i am in method 4");
        }

        @Override
        public void method5() {

            System.out.println("i am in method 5");
        }
    }






