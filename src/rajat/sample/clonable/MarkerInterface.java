package rajat.sample.clonable;
import java.util.*;
public class MarkerInterface implements Cloneable{
    public String name;
    public Object getClone() throws CloneNotSupportedException {
        return  clone();
    }
}
