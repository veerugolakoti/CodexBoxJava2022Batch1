package BhargavTej27.DailyTopicsProblems.ExceptionExamples;

public class ExceptionHandling2 {
     public static int instagram(int a,int b) {
       int  i = a/b;
       return i;
    }
   public static int facebook(int a,int b){
         int ans = 0;
         try{
             ans = instagram(a,b);
         }
         catch(ArithmeticException ar){
             System.out.println("ArithmeticException is occurred");
        }
         return ans;
    }

}