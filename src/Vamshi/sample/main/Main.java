package Vamshi.sample.main;

import TejaAravind.singleton.Singleton;
import Vamshi.sample.singleton.Singleton1;

public class Main {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getSingleton();
        Singleton1 singleton2 = Singleton1.getSingleton();
        System.out.println(singleton1);
        System.out.println(singleton2);



    }
}
