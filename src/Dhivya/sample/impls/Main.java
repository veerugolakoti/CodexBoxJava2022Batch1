package Dhivya.sample.impls;

public class Main {
        public static void main(String[] args) {
            TaggedInterface taggedInterface1=new TaggedInterface();
            taggedInterface1.name="divya";
            System.out.println("actual name : " + taggedInterface1.name);
            TaggedInterface taggedInterface2 = new TaggedInterface();
            taggedInterface2.name="dhivya";
            System.out.println("other name : " + taggedInterface2.name);
        }
    }

