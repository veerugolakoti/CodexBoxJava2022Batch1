package sangamesh.Inheritance;

public abstract class Ipl {
    int overs = 25;
    String batsman;
    float runrate;
    int wickets = 3;


    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }


    public int getOvers() {
        return overs;
    }

    public abstract void setOvers(int overs);

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
