package Sivannarayana.MainPackage;

import Sivannarayana.Exception.Exceptionexample;

import static Sivannarayana.Exception.Exceptionexample.whatsup;

public class MainMethod {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int f = whatsup(a,b);
        }
        catch (ArithmeticException sr){
            System.out.println("ArthamaticE");
        }
        System.out.println("tejaarvaind");
    }
}


