package ganesh.sample.main;

import ganesh.sample.stringoperations.ImmutableApplication;
import ganesh.sample.stringoperations.mutableApplication;
import sun.security.ec.point.ProjectivePoint;

public class MainApplication {
    public static void main(String[] args) {
        //mutable application
        mutableApplication gun = new mutableApplication();
        gun.m1();

        //Immutable application
        ImmutableApplication im = new ImmutableApplication();
        im.m2();

    }

}

