package sangamesh.datatypes;

public class Exam {
    private String examname;
    private String examedate;

    public String getExamname() {
        return examname;
    }

    public void setExamname(String examname) {
        this.examname = examname;
    }

    public String getExamedate() {
        return examedate;
    }

    public void setExamedate(String examedate) {
        this.examedate = examedate;
    }

    public boolean getExamresult() {
        return examresult;
    }

    public void setExamresult(boolean examresult) {
        this.examresult = examresult;
    }

    private boolean examresult;


}
