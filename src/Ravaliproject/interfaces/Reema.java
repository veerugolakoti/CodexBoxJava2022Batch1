package Ravaliproject.interfaces;

import Ravaliproject.collections.StudentList;

public  class Reema  implements Employee{
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

    @Override
    public StudentList setName(String s) {
        return null;
    }
}
