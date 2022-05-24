package vidya.Exception.Exception;

public class EmployeeR {
 public    int empId = 22;
  public    String  Name = "Deeksha";



    public void EmpoyeeR(int empId) {
    if(empId == 0) {
        try {
            throw new VidyaException("empId is not valid");
        } catch (VidyaException e) {
            System.out.println("empId valid in " +empId);
        }
    }
}
    }

