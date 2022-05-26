package TejaAravind.exceptionhandling;

public class Human implements Cloneable  {
    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Human(String name, String job){
        this.name = name;
        this.job = job;
    }
//    public Human getClone() {
//        Human obj = null;
//        try{
//             obj = (Human) clone();
//             return obj;
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        return obj;
//    }
    public Human getClone() throws CloneNotSupportedException {
        return (Human) clone();
    }
    public void getUncheckedException() throws ArithmeticException{
        int[] arr = {1,2,3,4};
        try{
            arr[5] = 565;

        }catch (Exception e){
            System.out.println(e.toString());
            throw new TejaUncheckedException("Teja exception");

        }finally {


            int a = 10;
            a = a / 0;
            System.out.println(a);
        }
    }



}
