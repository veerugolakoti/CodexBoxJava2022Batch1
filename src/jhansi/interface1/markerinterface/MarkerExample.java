package jhansi.interface1.markerinterface;

public class MarkerExample implements Cloneable {
    String name;
    int id;
    public  MarkerExample(String name,int id){
        this.name=name;
        this.id=id;
    }
    public Object getMarkerExample() throws CloneNotSupportedException{
        return clone();
    }


    }


