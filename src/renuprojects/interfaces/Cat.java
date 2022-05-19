package renuprojects.interfaces;

public class Cat implements Animals{
    @Override
    public void run() {
        System.out.println("cat is running");
    }

    @Override
    public void jump() {
        System.out.println("its not jumping");
    }
}
