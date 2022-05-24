package BhargavTej27.DailyTopicsProblems.Singletonexamples;

public class Main2 {
    public static void main(String[] args) {
        SingleTon2 ranjan = SingleTon2.getcompany();
        SingleTon2 bargav = SingleTon2.getcompany();
//        ranjan.str = ranjan.str.toUpperCase();
        try{
//            System.out.println("My Name is Ranjan." + ranjan.str);
//            System.out.println ("My Name is Bargav." + bargav.str);

        }catch (Exception e){
            System.out.println(e.getMessage());

        }

        System.out.println(ranjan.hashCode());
        System.out.println(bargav.hashCode());
    }
}
