package rajat.sample.immutablility;

public final class ImmutabilityClass {
    private final Integer empId;
    private final String name;
    private final String phNumber;
    private final Double salary;
    private final Float bonus;


    public Integer getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public Float getBonus() {
        return bonus;
    }


    public ImmutabilityClass(Integer empId, String name, String phNumber, Double salary, Float bonus) {
        this.empId = empId;
        this.name = name;
        this.phNumber = phNumber;
        this.salary = salary;
        this.bonus = bonus;
    }
}