package Veeru.sample.abstraction;

public abstract class EmployeesAbstraction {

    private  Long employeeId;
    private String empName;
    private String address;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract  String qualification() ;

   public abstract String careerPercentage() ;
}
