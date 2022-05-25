package Sivannarayana.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
public class collectionexample {
    public static void main(String args[]) {
       /* ArrayList<String> compamy = new ArrayList<String>();
        compamy.add("Tcs");
        compamy.add("capgemini");
        compamy.add("ibm");
        compamy.add("wipro");
        System.out.println(compamy);*/
        // LinkedList
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Java");
        System.out.println("LinkedList: " + languages);
        languages.set(3, "pega");
        System.out.println("Updated LinkedList: " + languages);
    }
}
