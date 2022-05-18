package Veeru.sample.immutability;

public final class ImmutabilityExample {
    private final  Integer number;

    public Integer getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Double getSalary() {
        return salary;
    }

    private final String address;
    private  final String phoneNumber;
    private final Double salary;

    public ImmutabilityExample(Integer number, String address, String phoneNumber, Double salary) {
        this.number = number;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }





}
