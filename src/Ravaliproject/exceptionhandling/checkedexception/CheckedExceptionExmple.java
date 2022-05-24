package Ravaliproject.exceptionhandling.checkedexception;

public class CheckedExceptionExmple extends Exception {

    public String name;
    public int id;

    public CheckedExceptionExmple(String name, int id) {
        this.name= name;
        this.id=id;
    }

    public Object getCheckedExceptionExmple1() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            //  throw new RuntimeException(e);
            System.out.println("clonenot supported");
        }

        return null;
    }


}

