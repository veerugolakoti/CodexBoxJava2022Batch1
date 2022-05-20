package rajat.sample.practice;

public class PracticeBesic {
    int a;
    public static int b= 20;
//      PracticeBesic(){
//        System.out.println("default ");
//    }
//    PracticeBesic(int b){
//        System.out.println(b);
//        System.out.println("Parameter");
//    }

    public void add(){


        System.out.println(a);
        System.out.println(b);
    }
   public static void sub(){
//        int c;
//        System.out.println(c);
//        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        PracticeBesic.sub();

        PracticeBesic practiceBesic = new PracticeBesic();
        practiceBesic.add();
    }
}
