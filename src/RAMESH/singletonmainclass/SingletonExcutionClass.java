package RAMESH.singletonmainclass;

import RAMESH.singletone1.SingletonExample;

public class SingletonExcutionClass {
    public static void main(String[] args) {
        SingletonExample s = SingletonExample.singletonExample1();
        SingletonExample t = SingletonExample.singletonExample1();
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
    }

}
