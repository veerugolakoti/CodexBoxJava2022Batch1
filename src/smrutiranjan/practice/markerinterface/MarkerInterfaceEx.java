package smrutiranjan.practice.markerinterface;

import java.lang.Cloneable;
public class MarkerInterfaceEx implements Cloneable {
    int i;

    public MarkerInterfaceEx(int i) {
        this.i = i;
    }

    @Override
    protected Object clone() {


            return null;
        }

    }





