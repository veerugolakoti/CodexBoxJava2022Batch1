package JavaTraining.wordcountassessment;
import java. util.*;
public class FoodCourt {
    Scanner sc = new Scanner (System.in);
    String food[]=new String[]{"biryani","dosa","idly","puri","vada"};
    int price[]=new int []{300,50,60,45,50};

 void order(){
     for(int i=0;i< food.length; i++ ){
         System.out.println(i+1 +" " + food[i] + "=="+ price[i] +"Rs");

 }

}
 void takingorder(){

     for(int i=0;i<=5;i++){
         int cart=0;
         System.out.println("enter the order to deliver");
         switch(sc.nextInt()) {
             case 1:
                 System.out.println(food[0]);
                 System.out.println(price[0]);
                 System.out.println("do you want any thing else yes or no:");
                 break;
             case 2:
                 System.out.println(food[1]);
                 System.out.println(price[1]);
                 break;
             case 3:
                 System.out.println(food[2]);
                 System.out.println(price[2]);
                 break;
             case 4:
                 System.out.println(food[3]);
                 System.out.println(price[3]);
                 break;
             case 5:
                 System.out.println(food[4]);
                 System.out.println(price[4]);
                 break;
             default:
                 System.out.println("enter valid data:");

         }
         String s=sc.next();
                 if(s.equalsIgnoreCase("no"));
         {
             break;
         }



     }

    }
}
