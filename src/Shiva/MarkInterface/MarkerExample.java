package Shiva.MarkInterface;

public class MarkerExample implements Cloneable {
    String name;
    int id;

    public Object clonnableObj() throws CloneNotSupportedException {
        return clone();
    }
}
