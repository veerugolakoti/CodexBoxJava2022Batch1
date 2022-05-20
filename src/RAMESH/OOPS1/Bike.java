package RAMESH.OOPS1;

public class Bike extends Vehicle{
    private int distance;
    private int time;
    public Bike(int getdistance,int getTime){
        this.distance=getdistance;
        this.time=getTime;

    }
    @Override
    public double speed() {
        return time*distance;
    }
}
