package Shiva.MarkInterface;

public class MarkerExample implements Cloneable {
    public String name;
    int id;

    public Object clonnableObj() throws CloneNotSupportedException {
        return clone();
    }
}
