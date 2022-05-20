package Ravaliproject.interfaces;

public class Reema  implements Employee{
    @Override
    public String name() {
        return "Lucky";
    }

    @Override
    public int id() {
        return 45;
    }

    @Override
    public String salary() {
        return "54000";
    }
}
