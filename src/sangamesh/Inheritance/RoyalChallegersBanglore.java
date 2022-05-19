package sangamesh.Inheritance;

public class RoyalChallegersBanglore extends Ipl {
  private  int overs = 20;
  private  String batsman = "ABD";
   private float runrate = 9.8f;

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public String getBatsman() {
        return batsman;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public float getRunrate() {
        return runrate;
    }

    public void setRunrate(float runrate) {
        this.runrate = runrate;
    }

}
