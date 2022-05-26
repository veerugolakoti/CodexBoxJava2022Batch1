package harshadeepthi.checkedexception;

public  abstract class Student {
    private Long studentId;
    private String studentName;
    private String studentaddress;
    public Long getStudentId(){
        return studentId;
    }
    public void setStudentId(Long studentId){
        this.studentId=studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public String getStudentaddress(){
        return studentaddress;
    }
    public void setStudentaddress(String studentaddress){
        this.studentaddress=studentaddress;
    }
    public abstract  String percentage();
    public abstract String qualification();


}
