package BhargavTej27.DailyTopicsProblems.Singletonexamples;

public class MainSingleton {
    public static void main(String[] args) //hashCode method
    {
        MySingleTon x = MySingleTon.shiva();
        MySingleTon y = MySingleTon.shiva();
        System.out.println("x = " +  x.hashCode());
        System.out.println("y = " +  y.hashCode());
    }
}