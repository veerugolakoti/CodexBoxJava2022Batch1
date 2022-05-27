package ramdurgaprasad.sample.flowcontrol;

public class ForApplication {
    public static void main(String[] args) {

        for(int i=1;i<=19;i++){
            for(int j=1;j<=19-i+1;j++){
                System.out.print( " z"+ " ");
            }
            System.out.println( );
            System.out.println( );

        }
    }
}
