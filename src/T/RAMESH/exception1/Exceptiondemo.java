package T.RAMESH.exception1;

public class Exceptiondemo {
    Integer distance;
    Integer time;

    public Integer getDistance() {
        return distance;
    }

    public Integer getTime() {
        return time;
    }

    public Exceptiondemo(Integer distance, Integer time) {
        this.distance = distance;
        this.time = time;
    }

    public int finddistance(){
        int speed = 0 ;
        try {
            speed  = distance/time;
        }
        catch (ArithmeticException e){
            System.out.println("give valied time");


        }


        return speed;
    }
}




