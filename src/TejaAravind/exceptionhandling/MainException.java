package TejaAravind.exceptionhandling;

import java.io.File;
import java.io.FileReader;

public class MainException {
    public static void main(String[] args) throws CloneNotSupportedException {
       Human human1 = new Human("sam", "social worker");
        System.out.println(human1.getName());
        System.out.println(human1.getJob());

        Human human2 = human1.getClone();






//        Human human2 = null;
//        try{
//            human2 = human1.getClone();
//        }catch (Exception e){
//            System.out.println("sasi exception");
//        }


        try {
            System.out.println(human2.getName());
            System.out.println(human2.getJob());
        } catch (Exception e){
            System.out.println("sasi exception");
        }


        }

//        Human human2 = human1.getClone();
//        System.out.println(human2.getName());
//        System.out.println(human2.getJob());

//        try{
//            System.out.println(human2.getName());
//            System.out.println(human2.getJob());
//        }catch(Exception e) {
//            System.out.println(e.getMessage());
//        }


//        if (human2 != null){
//            System.out.println(human2.getName());
//            System.out.println(human2.getJob());
//        }

//        Human human2 = human1.getClone();

//         try {
//             int num = 78/0;
//         }catch (Exception e){
//             System.out.println(e.getMessage());
//         }
//
//        try {
//            Integer num = null;
//            num =num +1;
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//
//        try {
//            String str = "hehfu";
//            char ch = str.charAt(5);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            File file = new File("E:// file.txt");
//            FileReader fr = new FileReader(file);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//
//        try {
//            int num = Integer.parseInt("uihfe73");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//
//        try {
//            int[] arr = new int[3];
//            arr[4] = 87;
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            int num = average(80,88,0);
//        }catch (TejaCheckedException e){
//            System.out.println(e.getMessage());
//        }
//
//
//    }
//    public static int average(int marks1, int marks2, int noOfSub) throws TejaCheckedException{
//        int avg;
//        try{
//            avg = (marks1+marks2)/noOfSub;
//        } catch (Exception e){
//            throw new TejaCheckedException("Hey do not divide by zero");
//        }
//        return avg;
//    }

}
