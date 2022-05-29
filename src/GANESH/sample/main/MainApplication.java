package ganesh.sample.main;

import ganesh.sample.list.Arraylistexample;
import ganesh.sample.stringoperations.ImmutableApplication;
import ganesh.sample.stringoperations.mutableApplication;
import sun.security.ec.point.ProjectivePoint;

import java.util.ArrayList;

public class MainApplication {
    public static void main(String[] args) {
      /*  //mutable application
        mutableApplication gun = new mutableApplication();
        gun.m1();

        //Immutable application
        ImmutableApplication im = new ImmutableApplication();
        im.m2();
*/

        //Arraylist application
        Arraylistexample alm = new Arraylistexample();
        alm.m1();
    }

}

