package ramdurgaprasad.sample.taggedinterface;

import java.util.Scanner;

public class Taggedinterface implements cloneable {
    int strength;
    String office;
    float salary;


    public Taggedinterface(int strength, String office, float salary) {
        this.strength = strength;
        this.office = office;
        this.salary = salary;

    }

    public void Tagged() {

        System.out.println("office strength:" + strength);
        System.out.println("the office is;" + office);
        System.out.println("the salary is:" + salary);


    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("the values to print:");
        int strength = sc.nextInt();
        System.out.println("the office is ");
        String office= sc.next();
        System.out.println("the salary");
        float salry=sc.nextFloat();
        Taggedinterface ti=new Taggedinterface(29,"codexbox",12500.5f);
        Taggedinterface tin= (Taggedinterface) ti.clone();
             tin.Tagged();
    }
}
