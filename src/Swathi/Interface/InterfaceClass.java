package Swathi.Interface;

public  class InterfaceClass implements Swathi {
    final String colour="blue";

    @Override
    public void write() {
        System.out.println("writing");
    }

    @Override
    public void jump() {
        System.out.println("jumping");
    }

    @Override
    public void walk() {
        System.out.println("walk");
    }
}
