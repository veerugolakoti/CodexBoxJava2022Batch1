package RAMESH.OOPS1;

public class ACar extends Vehicle{
    private int distance;

    private int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private int time;


    @Override
    public double speed() {
        return time*distance;
    }
}







