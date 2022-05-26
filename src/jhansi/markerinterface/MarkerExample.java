package jhansi.markerinterface;

public class MarkerExample implements Cloneable {
    public String name;
    public int id;
    public  MarkerExample(String name,int id){
        this.name=name;
        this.id=id;
    }
    public Object getMarkerExample() throws CloneNotSupportedException{
        return clone();
    }


    }


