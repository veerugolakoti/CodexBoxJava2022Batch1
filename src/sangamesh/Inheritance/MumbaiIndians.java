package sangamesh.Inheritance;

public class MumbaiIndians extends Ipl {

  private  String batsman = "Rohit";
  private  float runrate = 12.6f;



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
