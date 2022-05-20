package Nagarjuna1Marker;

public class MarkerInterface implements Cloneable{
int num;
void display() {
    System.out.println("Hi codex");
}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
