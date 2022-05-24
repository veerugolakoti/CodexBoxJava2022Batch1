package Vamshi.sample.exceptionalhandling;

public class Employee {
    private int java1 = 30;
    private int reactjs = 20;
    private int training = 0;
    public void employee(){
        try{
     int d =reactjs/training;
    }catch(ArithmeticException e){
            try {
                throw new UnCheckedException(e.getMessage());
            }catch(UnCheckedException d){
                System.out.println("run time exception");

            }
        }
        }


    public int getJava1() {
        return java1;
    }

    public int getReactjs() {
        return reactjs;
    }

    public int getTraining() {
        return training;
    }
}
