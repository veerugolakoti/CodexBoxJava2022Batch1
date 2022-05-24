package sangamesh.exceptionhandling;

public class employee implements Cloneable {
    String name;
    String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public employee(String name, String address) {
        this.name = name;
        this.address = address;
    }
//    public employee getClone() throws CloneNotSupportedException {
//        return (employee) clone();
//    }
}
