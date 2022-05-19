package sangamesh.Inheritance;

public class Main {
    public static void main(String[] args) {
        RoyalChallegersBanglore rcb = new RoyalChallegersBanglore();
        System.out.println(rcb.getOvers());
        System.out.println(rcb.getBatsman());
        MumbaiIndians mi = new MumbaiIndians();
        System.out.println(mi.getRunrate());
        System.out.println(mi.getBatsman());
        Ipl ipl = new MumbaiIndians();
        System.out.println(mi.getOvers());
    }
}
