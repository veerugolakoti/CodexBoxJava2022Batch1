package vidhya.singleTon;

public class SExample {
     static SExample single_instance ;


        public String S;
        private SExample(){
            S = "i am a string ";
            }
            public  static SExample getInstance(){
            if (single_instance == null)
                single_instance = new SExample();
            return single_instance;
            }

    public static void main(String[] args) {
        SExample a = getInstance();
        SExample b = getInstance();
        SExample c = getInstance();
        System.out.println("hash code of 'a' is"  + a.hashCode());
        System.out.println("hash code of 'b' is"  + b.hashCode());
        System.out.println("hash code of 'c' is"  + c.hashCode());

        //condition check
        if(a==b && b==c){
            System.out.println("3 variables same object");
        }
        else {
            System.out.println("3 variables not same object");
        }


    }
}