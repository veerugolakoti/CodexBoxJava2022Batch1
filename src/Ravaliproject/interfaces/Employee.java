package Ravaliproject.interfaces;

import Ravaliproject.collections.StudentList;

public interface Employee {

    String name();

    abstract int id();

    abstract String salary();


    StudentList setName(String s);
}
